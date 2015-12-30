package insweb.utils;

import javax.imageio.ImageIO;
import javax.servlet.ServletInputStream;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * 文件上传跨域问题
 * 
 * @author jiangxin
 */
public class HttpsUpload {

	/**
	 * 上传
	 * @author jiangxin
	 * @return
	 */
	public static String upload(String path,byte[]buf,String fileName){
		try{
			URL url=new URL(path);
			HttpURLConnection  con=(HttpURLConnection) url.openConnection();
			String val="image/gif,image/x-xbitmap,image/jpeg,image/pjpeg,application/vnd.ms-excel,application/vnd.ms-powerpoint,application/msword,application/x-shockwave-flash,application/x-quickviewplus,*/*";
			con.setRequestProperty("Accept", val);
			con.setRequestProperty("Accept-Language", "zh-cn");
			con.setRequestProperty("Content-type", "multipart/form-data;   boundary=---------------------------7d318fd100112");
			con.setRequestProperty("Accept-Encoding", "gzip,deflate");
			con.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible;MSIE 6.0;Windows NT 5.1)");
			con.setRequestProperty("Connection", "Keep-Alive");
			con.setDoOutput(true);
			con.setUseCaches(true);
			
			OutputStream out=con.getOutputStream();
			byte[]filebyte=fileName.trim().getBytes();
			out.write(filebyte);
			out.write('|');
			out.write(buf);
			out.flush();
			out.close();
			
			int code=con.getResponseCode();
			if(code==200){
				InputStream is=con.getInputStream();
				BufferedReader reader=new BufferedReader(new InputStreamReader(is));
				String currentLine=null;
				String sTotalString="";
				while((currentLine=reader.readLine())!=null){
					if(currentLine.length()>0){
						sTotalString+=currentLine;
					}
				}
				return sTotalString;
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public static String formUpload(String path, Map<String, String> paramMap, String fileName, InputStream is){
		return formUpload(path, paramMap, fileName, "image/jpeg", is);
	}


	public static String formUpload(String path, Map<String, String> paramMap, String fileName, String contentType, InputStream is) {
		String res = "";
		HttpURLConnection conn = null;
		String BOUNDARY = "---------------------------123821742118716"; //boundary就是request头和上传文件内容的分隔符
		try {
			URL url = new URL(path);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(30000);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept-Charset", "UTF-8");
			conn.setRequestProperty("contentType", "UTF-8");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
			conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
			OutputStream out = new DataOutputStream(conn.getOutputStream());
			// text
			if (paramMap != null) {
				StringBuffer strBuf = new StringBuffer();
				Iterator<Entry<String, String>> iter = paramMap.entrySet().iterator();
				while (iter.hasNext()) {
					Entry<String,String>entry =iter.next();
					String inputName = entry.getKey();
					String inputValue =entry.getValue();
					if (inputValue == null) {
						continue;
					}
					strBuf.append("\r\n").append("--").append(BOUNDARY).append("\r\n");
					strBuf.append("Content-Disposition: form-data; name=\""+inputName+"\"\r\n\r\n");
					strBuf.append(inputValue);
				}
				out.write(strBuf.toString().getBytes());
			}

			// file
			if(is!=null&&fileName!=null){
				StringBuffer sb=new StringBuffer();
				sb.append("\r\n").append("--").append(BOUNDARY).append("\r\n");
				sb.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + fileName  + "\"\r\n");
				sb.append("Content-Type:" + contentType + "\r\n\r\n");
				out.write(sb.toString().getBytes("UTF-8"));

				byte[]buffer=new byte[1024];
				int index=-1;
				while((index=is.read(buffer))!=-1){
					out.write(buffer,0,index);
				}
				is.close();
			}

			byte[] endData = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();
			out.write(endData);
			out.flush();
			out.close();

			// 读取返回数据
			StringBuffer strBuf = new StringBuffer();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null) {
				strBuf.append(line);
			}
			res = strBuf.toString();
			reader.close();
			reader = null;
		} catch (Exception e) {
			System.out.println("发送POST请求出错。" + path);
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
				conn = null;
			}
		}
		return res;
	}

	public static void upload(ServletInputStream sis, int len) throws IOException{
		byte[] buffer = new byte[len]; // 用于缓存每次读取的数据
		byte[] result = new byte[len]; // 用户存放结果的数组

		int count = 0;
		int rbyte = 0;
		// 循环读取
		while (count < len) {
			rbyte = sis.read(buffer); // 每次实际读取长度存于rbyte中 sflj
			for (int i = 0; i < rbyte; i++) {
				result[count + i] = buffer[i];
			}
			count += rbyte;
		}

		// 先找到文件名和图片流的标志位'|'
		int index = 0;
		for (int i = 0; i < result.length; i++) {
			byte b = result[i];
			if (b == '|') {
				index = i;
				break;
			}
		}

		// 存放文件名
		byte name[] = new byte[index + 1];
		// 存放图片字节
		byte[] img = new byte[len - index];
		for (int i = 0; i < result.length; i++) {
			if (i < index) {
				name[i] = result[i];
			}
			if (i > index) {
				// 这时注意img数组的index要从0开始
				img[i - index - 1] = result[i];
			}
		}
		// 还原文件名
		String fileName = new String(name);
		sis.close();
		// 改变图片大小后重新放置到新地点
		
		ByteArrayInputStream bais=new ByteArrayInputStream(img);
		Image image=ImageIO.read(bais);
		int pos=fileName.indexOf(".");
		String prefix=fileName.substring(0,pos);
		String suffix=fileName.substring(pos+1,fileName.length());
		
		File f=new File("E://"+prefix);
		ImageIO.write((RenderedImage) image, suffix, f);
	}
    
}
