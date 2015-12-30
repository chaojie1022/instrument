/**
 * Project Name:kcloud
 * File Name:GetWebPage.java
 * Package Name:com.iflytek.kcloud.web.utils
 * Date:2014年5月21日下午3:22:38
 * Copyright (c) 2014, zyyang3@iflytek.com All Rights Reserved.
 *
 */

package insweb.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * ClassName:GetWebPage <br/>
 * Description: TODO ADD Description. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014年5月21日 下午3:22:38 <br/>
 *
 * @author zyyang3
 * @version 1.0
 * @see
 * @since JDK 1.6
 */
public class GetWebPage {

    /**
     * 获取网页内容
     *
     * @param strUrl
     * @return
     */
    public static String getContent(String strUrl) {
        try {
            URL url = new URL(strUrl);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                url.openStream(), "utf-8"));
            String s = "";
            StringBuffer sb = new StringBuffer("");
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            br.close();
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "error open url:" + strUrl;
        }
    }


}

