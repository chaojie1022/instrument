package insweb.utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/**
 * 获取appid工具类
 *
 * @author jwcao@iflytek.com 2014-07-14
 */
public class ServiceUtils {

    /**
     * 过滤保留的appid
     *
     * @param appid
     * @return
     */
    public static Boolean filterAppid(String appid) {
        // 沈超测试
        if (appid.equals("kcabcd0001")) {
            return true;
        }
        // 测试组
        if (appid.equals("kctest0001")) {
            return true;
        }
        // 中医
        if (appid.equals("kczy000001")) {
            return true;
        }
        // 中医
        if (appid.equals("kczy000002")) {
            return true;
        }
        // 车载
        if (appid.equals("kccartest001")) {
            return true;
        }
        return false;
    }

    /**
     * 资源发布模块过滤
     *
     * @param module
     * @return
     */
    public static Boolean filterModule(String module) {
        if (module.equals("mamQA") || module.equals("parenting")
            || module.equals("faq") || module.equals("calc") || module.equals("datetime")
            || module.equals("pattern") || module.equals("forbidden")
            || module.equals("forbidden") || module.equals("chat") || module.equals("openQA")
            || module.equals("videoQA") || module.equals("musicQA")
            || module.equals("gas_health_news") || module.equals("gas_health")||module.equals("__all")) {
            return false;
        }
        return true;
    }


    /**
     * mapperCid:cid 转换成appid. <br/>
     *
     * @param cid
     * @return
     * @author zyyang3
     * @since JDK 1.6
     */
    public static String mapperCid(String cid) {
        if (cid.equals("xiaomi")) {
            return "'5285e334'";
        } else if (cid.equals("oppo")) {
            return "'5285e3b0'";
        } else if (cid.equals("yudian")) {
            return "'4edca818','4f310ba1'";
        } else if (cid.equals("lingxi")) {
            return "'508627e4','5121ed60'";
        } else {
            return "";
        }
    }



    /**
     * demoInfo:demo展示获取相应的数据. <br/>
     *
     * @param json 请求返回的json字符串
     * @return 需要展示的字符串
     * @throws JSONException
     * @author zyyang3
     * @since JDK 1.6
     */
    public static Map<String, String> demoInfo(String json) throws JSONException {
        Map<String, String> result = new HashMap<String, String>();
        JSONObject resultjson = new JSONObject();
        try {
            resultjson = new JSONObject(json);
        } catch (Exception e) {
            result.put("json", json);
            return result;
        }

        if (resultjson.has("webPage")) {
            JSONObject webjson = new JSONObject();
            try {
                webjson = resultjson.getJSONObject("webPage");
            } catch (Exception e) {
                result.put("json", json);
                return result;
            }
            if (webjson.has("url")) {
                String url = webjson.getString("url");
                result.put("url", url);
                return result;
            } else {
                result.put("json", json);
                return result;
            }
        }

        result.put("json", json);
        return result;
    }

    /**
     * cidToName:知识云产品cid-中文名转换. <br/>
     *
     * @param cid 产品cid标识
     * @return 产品中文名称
     * @author zyyang3
     * @since JDK 1.6
     */
    public static String cidToName(String cid) {
        if (cid.equals("all")) {
            return "知识云";
        } else if (cid.equals("yudian")) {
            return "语点";
        } else if (cid.equals("lingxi")) {
            return "灵犀";
        } else if (cid.equals("xiaomi")) {
            return "小米";
        } else {
            return cid;
        }
    }

    /** 
     * 判断文件的编码格式 
     * @param fileName :file 
     * @return 文件编码格式 
     * @throws Exception 
     */  
    public static String codeString(String fileName) throws Exception{  
        BufferedInputStream bin = new BufferedInputStream(  
        new FileInputStream(fileName));  
        int p = (bin.read() << 8) + bin.read();  
        String code = null;  
          
        switch (p) {  
            case 0xefbb:  
                code = "UTF-8";  
                break;  
            case 0xfffe:  
                code = "Unicode";  
                break;  
            case 0xfeff:  
                code = "UTF-16BE";  
                break;  
            default:  
                code = "GBK";  
        }  
          
        return code;  
    }  
    
    /**
     * java读取文件
     *
     * @param path
     * @return
     * @throws Exception 
     */
    public static String loadAFileToStringDE3(String path) throws Exception {
        FileInputStream fInputStream = new FileInputStream(path);  
      //code为上面方法里返回的编码方式  
      InputStreamReader inputStreamReader = new InputStreamReader(fInputStream, codeString(path));  
      BufferedReader in = new BufferedReader(inputStreamReader);  
        
      String strTmp = "";  
      StringBuffer sBuffer=new StringBuffer();
    //按行读取  
      while (( strTmp = in.readLine()) != null) {  
          sBuffer.append(strTmp+"\r\n");  
      }  
      return sBuffer.toString();
    }
    /**
     * int转Date
     * @param timestampString
     * @param format
     * @return
     */
    public static String TimeStampDate(String timestampString, String format) {
        
        Long timestamp = Long.parseLong(timestampString) * 1000;
        String date = new java.text.SimpleDateFormat(format).format(new java.util.Date(timestamp));
        return date;
    }
    //异常转义
    public static String getDesc(int id){
        String info = "";
        switch(id){
            case 0:info="请求结果正常";break;
            case 1:info="请求无返回结果";break;
            case 2:info="请求结果解析json失败";break;
            case 10:info="请求结果service异常";break;
            case 11:info="请求结果不存在service字段";break;
            case 20:info="请求结果ovs页面无法打开";break;
            case 21:info="请求结果不存在webPage字段或webpage->url字段不存在";break;
            case 30:info="请求结果ovs第三方页面包含违禁词/第三方页面无法打开";break;
            case 40:info="请求结果ovs内容没有更新";break;
            case 41:info="请求结果不存在data字段";break;
            case 42:info="请求结果不存在result字段";break;
            case 50:info="语义返回结果异常";break;
            case 51:info="请求结果不存在semantic/slots字段";break;
            case 101:info="请求返回结果已经恢复";break;
            case 102:info="请求json解析已经恢复";break;
            case 110:info="请求service已经恢复";break;
            case 111:info="请求结果不存在service已经恢复";break;
            case 120:info="请求结果ovs页面打开恢复";break;
            case 121:info="请求结果不存在webPage字段或webpage->url字段不存在已经恢复";break;
            case 140:info="请求结果ovs内容更新恢复";break;
            case 141:info="请求结果不存在data字段已经恢复";break;
            case 142:info="请求结果不存在result字段已经恢复";break;
            case 150:info="请求结果语义结果恢复正常";break;
            case 151:info="请求结果semantic/slots字段恢复正常";break;
        }
        return info;
    }
}
