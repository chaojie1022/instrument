/**
 * Project Name:kcloud File Name:ToolUtil.java Package Name:com.iflytek.kcloud.web.utils
 * Date:2014年6月24日下午5:21:30 Copyright (c) 2014, zyyang3@iflytek.com All Rights Reserved.
 *
 */

package com.kongwu.insweb.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * ClassName:ToolUtil <br/>
 * Description: 工具类工具. <br/>
 * Date: 2014年6月24日 下午5:21:30 <br/>
 *
 * @author zyyang3
 * @version 1.0
 * @see
 * @since JDK 1.6
 */
public class ToolUtil {

    private static char md5Chars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
        'c', 'd', 'e', 'f'};

    /**
     * 获取网页内容
     *
     * @param strUrl
     * @return
     */
    public static String getContent(String strUrl) {
        try {
            URL url = new URL(strUrl);
            BufferedReader br =
                new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
            String s = "";
            StringBuffer sb = new StringBuffer("");
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            br.close();
            return sb.toString();
        } catch (Exception e) {
            return "{\"error\":\"can not open url:" + strUrl+"\"}";
        }
    }


    /**
     * 中文转unicode
     *
     * @param gbString
     * @return
     */
    public static String gbEncoding(final String gbString) {
        char[] utfBytes = gbString.toCharArray();
        String unicodeBytes = "";
        for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
            String hexB = Integer.toHexString(utfBytes[byteIndex]);
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        return unicodeBytes;
    }

    /**
     * unicode转中文
     * @return
     */
    public static String unicodeToChinese(String str) {
        /*
         * if (IsChineseUtil.isHasChinses2(str))//判断是否有中文字符 return str;
         */
        if (str.indexOf("\\u") == -1 || str == null || "".equals(str.trim())) {/* 若不是unicode，则直接返回 */
            return str.replaceAll("\\\\ ", " ");// 删掉英文中的\,such as "default\ value1"
            /* 主要是针对 zk 中的国际化问题 */
        }
        StringBuffer sb = new StringBuffer();
        if (!str.startsWith("\\u")) {/* 若开头不是unicode，如“abc\u4e2d\u56fd” */
            int index = str.indexOf("\\u");
            sb.append(str.substring(0, index));
            str = str.substring(index);
        }
        if (str.endsWith(":")) /* 如“\u4e2d\u56fd：” */ {
            str = str.substring(0, str.length() - 1);
        }
        String[] chs = str.trim().split("\\\\u");

        for (int i = 0; i < chs.length; i++) {
            String ch = chs[i].trim();
            if (ch != null && !"".equals(ch)) {

                sb.append((char) Integer.parseInt(ch.substring(0, 4), 16));
                if (ch.length() > 4) {
                    sb.append(ch.substring(4));
                }
            }
        }
        return sb.toString();
    }

    /**
     * 结果比较工具
     *
     * @param online
     * @param test
     * @return
     * @throws JSONException
     */
    @SuppressWarnings("unused")
    public static Map<String, String> isopenurl(String online, String test) throws JSONException {
        String error = "";
        String[] result = new String[2];
        Map<String, String> resultMap = new HashMap<String, String>();
        // String isanswer = "一致";
        // String ismodel = "一致";

        // service
        String onlinemodel = "";
        String testmodel = "";
        String ismodel = "一致";

        // topic
        String online_topic = "";
        String test_topic = "";
        String istopic = "一致";


        /*
         * String onlineanswer = ""; String testanswer = ""; String isanswer = "一致";
         */
        // 操作码
        String onlineoperation = "";
        String testoperation = "";
        String isoperation = "一致";
        // 语义
        String online_semantic = "";
        String test_semantic = "";
        String issemantic = "一致";
        // 无效中间值
        String online_answer = "";
        String test_answer = "";
        String istext = "一致";
        // result
        String online_data = "";
        String test_data = "";
        String isdata = "一致";
        // 多结果
        String online_moreresults = "";
        String test_moreresults = "";
        String ismoreresults = "一致";
        // parseresult
        String onlineparseresult = "";
        String testparseresult = "";
        String isparseresult = "一致";
        // text
        String online_text = "";
        String test_text = "";

        JSONObject onlinejson = new JSONObject();
        JSONObject testjson = new JSONObject();
        try {
            onlinejson = new JSONObject(online);
            testjson = new JSONObject(test);
        } catch (Exception e) {

            System.out.println(online);
            System.out.println(test);
            error = "error";
            resultMap.put("error", e.toString());
            return resultMap;
        }

        if (onlinejson.has("service")) {
            onlinemodel = onlinejson.getString("service");
        }
        if (testjson.has("service")) {
            testmodel = testjson.getString("service");
        }

        // if(!onlinemodel.equals("pattern")&&)

        // 取值
        try {
            /** semantic */
            if (onlinejson.has("semantic")) {
                online_semantic = getStringMD5String(onlinejson.getString("semantic"));
            }
            if (testjson.has("semantic")) {
                test_semantic = getStringMD5String(testjson.getString("semantic"));
            }
            /** topic */
            if (onlinejson.has("answer")) {
                online_answer = getStringMD5String(onlinejson.getString("answer"));
                if (onlinejson.getJSONObject("answer").has("topic")) {
                    online_topic = onlinejson.getJSONObject("answer").getString("topic");
                }
                /** text */
                if (onlinejson.getJSONObject("answer").has("text")) {
                    online_text = onlinejson.getJSONObject("answer").getString("text");
                }
            }

            if (testjson.has("answer")) {
                test_answer = getStringMD5String(testjson.getString("answer"));
                if (testjson.getJSONObject("answer").has("topic")) {
                    test_topic = testjson.getJSONObject("answer").getString("topic");
                }
                /** text */
                if (testjson.getJSONObject("answer").has("text")) {
                    test_text = testjson.getJSONObject("answer").getString("text");
                }
            }
            /** result */
            if (onlinejson.has("data")) {
                // online_data = getStringMD5String(onlinejson.getString("data"));
                if (onlinejson.getJSONObject("data").has("result")) {
                    online_data = onlinejson.getJSONObject("data").getString("result");
                }
                /** parseresult */
                if (onlinejson.getJSONObject("data").has("parseresult")) {
                    // onlineparseresult =
                    // onlinejson.getJSONObject("data").getString("parseresult");
                    if (onlinejson.getJSONObject("data").getJSONObject("parseresult")
                        .has("result")) {
                        onlineparseresult =
                            onlinejson.getJSONObject("data").getJSONObject("parseresult")
                                .getString("result");
                    }
                }
            }
            if (testjson.has("data")) {
                // test_data = getStringMD5String(testjson.getString("data"));
                if (testjson.getJSONObject("data").has("result")) {
                    test_data = testjson.getJSONObject("data").getString("result");
                }
                /** parseresult */
                if (testjson.getJSONObject("data").has("parseresult")) {
                    // testparseresult = testjson.getJSONObject("data").getString("parseresult");
                    if (testjson.getJSONObject("data").getJSONObject("parseresult").has("result")) {
                        testparseresult =
                            testjson.getJSONObject("data").getJSONObject("parseresult")
                                .getString("result");
                    }
                }
            }

            /** operation */
            if (onlinejson.has("operation")) {
                onlineoperation = onlinejson.getString("operation");
            }
            if (testjson.has("operation")) {
                testoperation = testjson.getString("operation");
            }

            /** moreresults */
            if (onlinejson.has("moreResults")) {

                JSONArray arraytemp = onlinejson.getJSONArray("moreResults");
                for (int i = 0; i < arraytemp.length(); i++) {
                    if (!arraytemp.getJSONObject(i).isNull("webPage")) {
                        arraytemp.getJSONObject(i).remove("webPage");
                    }
                }
                online_moreresults = getStringMD5String(onlinejson.getString("moreResults"));
            }
            if (testjson.has("moreResults")) {

                JSONArray arraytemp = testjson.getJSONArray("moreResults");
                for (int i = 0; i < arraytemp.length(); i++) {
                    if (!arraytemp.getJSONObject(i).isNull("webPage")) {
                        arraytemp.getJSONObject(i).remove("webPage");
                    }
                }
                test_moreresults = getStringMD5String(testjson.getString("moreResults"));
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        // 对比结果
        String tempanswer = "";
        if (!onlinemodel.equals(testmodel)) {
            ismodel = "不一致";
            resultMap.put("service", "不一致");
        } else {
            resultMap.put("service", "一致");
        }
        if (!online_semantic.equals(test_semantic)) {
            // tempanswer += "semantic不一致;";
            resultMap.put("semantic", "不一致");
        } else {
            resultMap.put("semantic", "一致");
        }
        if (!onlinemodel.equals("pattern") && !onlinemodel.equals("chat")) {
            if (online_data.length() > 0 || test_data.length() > 0) {
                if (!online_data.equals(test_data)) {
                    // tempanswer += "data不一致;";
                    resultMap.put("data->result", "不一致");
                } else {
                    resultMap.put("data->result", "一致");
                }
            }
            if (online_moreresults.length() > 0 || test_moreresults.length() > 0) {
                if (!online_moreresults.equals(test_moreresults)) {
                    // tempanswer += "moreresults不一致;";
                    resultMap.put("moreresults", "不一致");
                } else {
                    resultMap.put("moreresults", "一致");
                }
            }
            if (online_topic.length() > 0 || test_topic.length() > 0) {
                if (!online_topic.equals(test_topic)) {
                    // tempanswer +="topic不一致";
                    resultMap.put("answer->topic", "不一致");
                } else {
                    resultMap.put("answer->topic", "一致");
                }
            }
            if (onlineparseresult.length() > 0 || testparseresult.length() > 0) {
                if (!onlineparseresult.equals(testparseresult)) {
                    resultMap.put("parseresult", "不一致");
                } else {
                    resultMap.put("parseresult", "一致");
                }
            }
            if (onlineoperation.length() > 0 || testoperation.length() > 0) {
                if (!onlineoperation.equals(testoperation)) {
                    resultMap.put("operation", "不一致");
                } else {
                    resultMap.put("operation", "一致");
                }
            }
            if (online_text.length() > 0 || test_text.length() > 0) {
                if (!online_text.equals(test_text)) {
                    resultMap.put("answer->text", "不一致");
                } else {
                    resultMap.put("answer->text", "一致");
                }
            }
        }

        /*
         * if (tempanswer.length() > 0) { isanswer = tempanswer; }
         */

        /*
         * result[0] = isanswer; result[1] = ismodel;
         */
        return resultMap;
    }

    public static String getStringMD5String(String str) throws Exception {
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(str.getBytes());
        return bufferToHex(messagedigest.digest());
    }

    private static String bufferToHex(byte bytes[]) {
        return bufferToHex(bytes, 0, bytes.length);
    }

    private static String bufferToHex(byte bytes[], int m, int n) {
        StringBuffer stringbuffer = new StringBuffer(2 * n);
        int k = m + n;
        for (int l = m; l < k; l++) {
            appendHexPair(bytes[l], stringbuffer);
        }
        return stringbuffer.toString();
    }

    private static void appendHexPair(byte bt, StringBuffer stringbuffer) {
        char c0 = md5Chars[(bt & 0xf0) >> 4];
        char c1 = md5Chars[bt & 0xf];
        stringbuffer.append(c0);
        stringbuffer.append(c1);
    }


    /**
     * 获取webpage
     *
     * @param urlpage
     * @return
     * @throws JSONException
     */
    public static String getWebPage(String urlpage) throws JSONException {
        String webpage = "";
        JSONObject onlinejson = new JSONObject();
        try {
            onlinejson = new JSONObject(urlpage);
        } catch (Exception e) {
            System.out.println(e);
            return webpage;
        }
        if (onlinejson.has("webPage")) {
            if (onlinejson.getJSONObject("webPage").has("url")) {
                webpage = onlinejson.getJSONObject("webPage").getString("url");
            }
        }
        return webpage;
    }

    /**
     * checkdata:检查是否有数据丢失. <br/>
     *
     * @param checkMap    检查的数据
     * @param checklength 检查长度
     * @param addlength   添加长度
     * @return 检查修复后的数据
     * @author zyyang3
     * @since JDK 1.7
     */
    public static Map<String, List<Object>> checkData(Map<String, List<Object>> checkMap,
        int checklength, int addlength) {

        Iterator<Map.Entry<String, List<Object>>> it = checkMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<Object>> entry = it.next();
            String key = entry.getKey();
            List<Object> list = entry.getValue();
            if (list.size() != checklength) {
                for (int i = 0; i < addlength; i++) {
                    list.add(0);
                }
                checkMap.put(key, list);
            }
        }
        return checkMap;
    }

    /**
     * 发送post请求
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        int i = 0;
        while (i < 5) {
            try {
                URL realUrl = new URL(url);
                URLConnection conn = realUrl.openConnection();
                conn.setRequestProperty("accept", "*/*");
                conn.setRequestProperty("connection", "Keep-Alive");
                conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
                // 发送POST请求必须设置如下两行
                conn.setDoOutput(true);
                conn.setDoInput(true);
                // 获取URLConnection对象对应的输出流
                out = new PrintWriter(conn.getOutputStream());
                // 发送请求参数
                out.print(param);
                // flush输出流的缓冲
                out.flush();
                out.close();
                // 定义BufferedReader输入流来读取URL的响应
                in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    result += "/n" + line;
                }
                System.out.println("url:" + param);
                in.close();
                return result;
            } catch (Exception e) {
                //e.printStackTrace();w
                System.out.println("error open url: " + url + param + "error:    " + e);
                i++;
                continue;
            }
        }
        return "error";
    }
    /**
     * 对比两个个key-value值随机，嵌套深度随机，字段顺序随机的json是否相同
     * @param o1
     * @param o2
     * @return
     * @throws JSONException
     */
    public static boolean jsonCompare(Object o1, Object o2) throws JSONException {
        if ((o1 != null && o2 == null) || (o1 == null && o2 != null)) {
            return false;
        }

        if (o1 == null && o2 == null) {
            return true;
        }

        if (o1.getClass() != o2.getClass()) {
            return false;
        }

        if (o1 instanceof JSONObject) {
            JSONObject jo1 = (JSONObject) o1;
            JSONObject jo2 = (JSONObject) o2;
            if (jo1.length() != jo2.length()) {
                return false;
            }
            Iterator<?> it = jo1.keys();
            while (it.hasNext()) {
                String skey = (String) it.next();
                if (!jo2.has(skey)
                        || !jsonCompare(jo1.get(skey), jo2.get(skey))) {
                    return false;
                }
            }
        } else if (o1 instanceof JSONArray) {
            JSONArray ja1 = (JSONArray) o1;
            JSONArray ja2 = (JSONArray) o2;
            if (ja1.length() != ja2.length()) {
                return false;
            }
            for (int i = 0; i < ja1.length(); i++) {
                if (!jsonCompare(ja1.get(i), ja2.get(i))) {
                    return false;
                }
            }
        } else {
            return o1.equals(o2);
        }

        return true;
    }
}
