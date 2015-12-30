/**
 * Copyright &copy; 2012-2013 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package insweb.utils;

import org.apache.commons.lang.time.DateFormatUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 *
 * @author ThinkGem
 * @version 2013-3-15
 */
public class DateUtils extends org.apache.commons.lang.time.DateUtils {

    private static String[] parsePatterns =
        {"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm"};
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd）
     */
    public static String getDate() {
        return getDate("yyyy-MM-dd");
    }

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String getDate(String pattern) {
        return DateFormatUtils.format(new Date(), pattern);
    }

    /**
     * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String formatDate(Date date, Object... pattern) {
        String formatDate = null;
        if (pattern != null && pattern.length > 0) {
            formatDate = DateFormatUtils.format(date, pattern[0].toString());
        } else {
            formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
        }
        return formatDate;
    }

    /**
     * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String formatUTCDate(Date date, Object... pattern) {
        String formatDate = null;
        if (pattern != null && pattern.length > 0) {
            formatDate = DateFormatUtils.formatUTC(date, pattern[0].toString());
        } else {
            formatDate = DateFormatUtils.formatUTC(date, "yyyy-MM-dd");
        }
        return formatDate;
    }

    /**
     * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String formatDateTime(Date date) {
        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String formatUTCDateTime(Date date) {
        return formatUTCDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 得到当前时间字符串 格式（HH:mm:ss）
     */
    public static String getTime() {
        return formatDate(new Date(), "HH:mm:ss");
    }

    /**
     * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String getDateTime() {
        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 得到当前年份字符串 格式（yyyy）
     */
    public static String getYear() {
        return formatDate(new Date(), "yyyy");
    }

    /**
     * 得到当前月份字符串 格式（MM）
     */
    public static String getMonth() {
        return formatDate(new Date(), "MM");
    }

    /**
     * 得到当天字符串 格式（dd）
     */
    public static String getDay() {
        return formatDate(new Date(), "dd");
    }

    /**
     * 得到当前星期字符串 格式（E）星期几
     */
    public static String getWeek() {
        return formatDate(new Date(), "E");
    }

    /**
     * 日期型字符串转化为日期 格式
     * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
     * "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm" }
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), parsePatterns);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 获取过去的天数
     *
     * @param date
     * @return
     */
    public static long pastDays(Date date) {
        long t = new Date().getTime() - date.getTime();
        return t / (24 * 60 * 60 * 1000);
    }


    public static Date getDateStart(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(formatDate(date, "yyyy-MM-dd") + " 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date getDateEnd(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(formatDate(date, "yyyy-MM-dd") + " 23:59:59");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * getDay:获取相对当前的日期. <br/>
     *
     * @param gap 与当前日期的差值(0,1,-1....)
     * @return
     * @author zyyang3
     * @since JDK 1.6
     */
    public static String getDay(int gap) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, gap);
        Date date = cal.getTime();
        String day = DateFormatUtils.format(date, "yyyy-MM-dd");
        return day;
    }


    /**
     * getDay:获取相对字符串日期. <br/>
     *
     * @param gap 与相对字符串日期的差值(0,1,-1....)
     * @return
     * @throws ParseException
     * @author zyyang3
     * @since JDK 1.6
     */
    public static String getDay(String time, int gap) throws ParseException {
        Calendar cal = Calendar.getInstance();
        Date datetmp = sdf.parse(time);
        cal.setTime(datetmp);
        cal.add(Calendar.DAY_OF_MONTH, gap);
        Date date = cal.getTime();
        String day = DateFormatUtils.format(date, "yyyy-MM-dd");
        return day;
    }

    public static Date addDay(Date dtime, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dtime);
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    public static Date addMonth(Date dtime, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dtime);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    public static int daysBetween(Date smdate, Date bdate)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }
    /***
     * 起始时间
     *
     * @Title: getDayStart
     * @param formatTime
     * @throws
     */
    public static Date getDayStart(String formatTime) {
        Date date = parseDate(formatTime);
        long time = date.getTime();
        return new Date(getDayStart(time));
    }
    /***
     * 起始时间
     *
     * @Title: getDayStart
     * @param date
     * @throws
     */
    public static Date getDayStart(Date date) {
        long time = date.getTime();
        return new Date(getDayStart(time));
    }

    /***
     * 结束时间
     *
     * @Title: getDayEnd
     * @param date
     * @throws
     */
    public static Date getDayEnd(Date date) {
        long time = date.getTime();
        return new Date(getDayEnd(time));
    }
    /***
     * 结束时间
     *
     * @Title: getDayEnd
     * @param formatTime
     * @throws
     */
    public static Date getDayEnd(String formatTime) {
        Date date = parseDate(formatTime);
        long time = date.getTime();
        return new Date(getDayEnd(time));
    }
    /***
     * 结束时间
     *
     * @Title: getDayEnd
     * @param time
     * @throws
     */
    public static long getDayEnd(long time) {
        return getDayStart(time) + 86400000;
    }

    /***
     * 起始时间
     *
     * @Title: getDayStart
     * @param time
     * @throws
     */
    public static long getDayStart(long time) {
        long t = (time + 28800000) % 86400000;
        return time - t;
    }

    /***
     * 周一
     * @Title: getMonday
     * @param date
     * @throws
     */
    public static Date getMonday(Date date) {
        Calendar cal = date2Calendar(date);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }


    /***
     * 当月最后一天
     * @Title: getFirstDayOfMonth
     * @param date
     * @throws
     */
    public static Date getFirstDayOfMonth(Date date) {
        Calendar cal = date2Calendar(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    /***
     * 当月最后一天
     * @Title: getLastDayOfMonth
     * @param date
     * @throws
     */
    public static Date getLastDayOfMonth(Date date) {
        Calendar cal = date2Calendar(date);
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.roll(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }
    /**
     * date> date1 返回 true
     * 否则  false
     * @param date
     * @param date1
     * @return
     */
    public static Boolean compare(Date date,Date date1) {
        return date.getTime() > date1.getTime();
    }
    /**
     * Date类型转换到Calendar类型
     *
     * @param d
     * @return
     */
    public static Calendar date2Calendar(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        return c;
    }

    /**
     * Calendar类型转换到Date类型
     *
     * @param c
     * @return
     */
    public static Date calendar2Date(Calendar c) {
        return c.getTime();
    }

    /**
     * Date类型转换到Timestamp类型
     *
     * @param d
     * @return
     */
    public static Timestamp date2Timestamp(Date d) {
        return new Timestamp(d.getTime());
    }

    /**
     * Calendar类型转换到Timestamp类型
     *
     * @param c
     * @return
     */
    public static Timestamp calendar2Timestamp(Calendar c) {
        return new Timestamp(c.getTimeInMillis());
    }

    /**
     * Timestamp类型转换到Calendar类型
     *
     * @param ts
     * @return
     */
    public static Calendar timestamp2Calendar(Timestamp ts) {
        Calendar c = Calendar.getInstance();
        c.setTime(ts);
        return c;
    }

    /**
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        //		System.out.println(formatDate(parseDate("2010/3/6")));
        //		System.out.println(getDate("yyyy年MM月dd日 E"));
        //		long time = new Date().getTime()-parseDate("2012-11-19").getTime();
        //		System.out.println(time/(24*60*60*1000));
/*	    System.out.println(getDay(-1));
        System.out.println(getDay(-8));
*/
    }
}
