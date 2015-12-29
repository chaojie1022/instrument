/**
 * Project Name:cloud File Name:FreemarkerFunction.java Package
 * Name:com.iflytek.web.freemarker.staticfunction Date:2014年4月21日下午4:15:25 Copyright (c) 2014,
 * zyyang3@iflytek.com All Rights Reserved.
 *
 */

package com.kongwu.insweb.freemarker.staticfunction;

import cn.drive.web.utils.DateUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * ClassName:FreemarkerFunction <br/>
 * Description: Freemarker页面自定义函数. <br/>
 * Date: 2014年4月21日 下午4:15:25 <br/>
 *
 * @author zyyang3
 * @version 1.0
 * @since JDK 1.6
 */
public class FreemarkerFunction {

    // private static Logger logger = LoggerFactory.getLogger(FreemarkerFunction.class);

    public static String getDay() {
        return DateUtils.getDay(0);
    }

    public static String getYesterDay() {
        return DateUtils.getDay(-1);
    }

    public static String getTimeRange() {
        return DateUtils.getDay(-6) + " - " + DateUtils.getDay(0);
    }

    public static String getTimeRange(int start, int end) {
        return DateUtils.getDay(start) + " - " + DateUtils.getDay(end);
    }

    public static String getCompareTimeRange() {
        return DateUtils.getDay(-13) + " - " + DateUtils.getDay(-7);
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
        if (cid != null) {
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
        } else {
            return "";
        }
    }

    /**
     * 解码
     * @param message
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String decode(String message) throws UnsupportedEncodingException {
        return URLDecoder.decode(message,"utf-8");
    }

}
