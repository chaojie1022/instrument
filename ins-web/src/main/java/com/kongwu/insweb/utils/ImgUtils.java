package com.kongwu.insweb.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/11/24 0024.
 */

public class ImgUtils {


    /**
     * 图片上传工具
     * @param file 图片文件
     * @param type  图片压缩类型 "1" -> 原图模式(可能压缩)  "2"-> 缩略图模式(可能压缩,可能裁剪)
     * @return  List<String> 图片文件地址urls
     */
    public static List<String> uploadImages(File file, String type) {
        List<File> files = new ArrayList<File>();
        files.add(file);
        return uploadImages(files, type);
    }

    /**
     * 远程图片转存，将图片流直接写入
     * @param src
     * @param type
     * @return
     * @throws IOException
     */
    public static List<String> uploadRemoteImages(String src,String type) throws IOException {
        List<String> urls = new ArrayList<String>();
//        URL url =new URL(src);
//        InputStream is=url.openStream();
//        Map<String,String> params = new HashMap<String,String>();
//        params.put("type",type);
//        String response = HttpsUpload.formUpload(Constants.imgUploadUrl, params,UUID.randomUUID().toString().replace("-",""),is);
//        Iterator<Object> iterator = JSON.parseArray(response).iterator();
//        while(iterator.hasNext()){
//            String u = iterator.next().toString();
//            urls.add(u);
//        }
        return urls;
    }
    public static List<String> uploadImages(List<File> files, String type) {

        List<String> urls = new ArrayList<String>();

//        HttpPost post = new HttpPost(Constants.imgUploadUrl);
//        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//
//
//        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
//        builder.addTextBody("type", type);
//
//        for (File file : files) {
//            builder.addBinaryBody("file", file);
//        }
//        HttpEntity entity = builder.build();
//        RequestConfig config = RequestConfig.custom().setConnectTimeout(20000)
//                .setSocketTimeout(50000).setCookieSpec(CookieSpecs.DEFAULT).build();
//        post.setEntity(entity);
//        post.setConfig(config);
//        CloseableHttpResponse response = null;
//        try {
//            response = HttpClients.createDefault().execute(post);
//            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                String str = EntityUtils.toString(response.getEntity());
//                Iterator<Object> iterator = JSON.parseArray(str).iterator();
//                while(iterator.hasNext()){
//                    String url = iterator.next().toString();
//                    urls.add(url);
//                }
//            } else {
//
//                return urls;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return urls;
//        } finally {
//            if (response != null) {
//                try {
//                    response.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        return urls;
    }
}
