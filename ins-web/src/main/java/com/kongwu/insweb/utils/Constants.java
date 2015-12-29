package com.kongwu.insweb.utils;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-15
 * <p>Version: 1.0
 */
public class Constants {
    public static final String CURRENT_USER = "user";
    public static final String CURRENT_Product = "product";
    /**
     * 图片服务器地址
     */
    public static final String imgUploadUrl = "http://drivetest.todaycity.cn:8011/common/upload";
    /**
     * 待审核
     */
    public static final int ORDER_STATUS_INIT = 0;
    /**
     * 审核通过
     */
    public static final int ORDER_STATUS_ACTIVE = 1;
    /**
     * 审核不通过
     */
    public static final int ORDER_STATUS_FAIL = 2;
    /**
     * 逻辑删除
     */
    public static final int ORDER_STATUS_DEL = -1;
    /**
     * 下架
     */
    public static final int ORDER_STATUS_SOLD_OUT = -2;
    /**
     * 审核通过
     */
    public static final int AUDIT_FLAG_THROUGH = 1;
    /**
     * 审核不通过
     */
    public static final int AUDIT_FLAG_PASS = -1;
    /**
     * 上架标识
     */
    public static final int PUT_FLAG_ON = 1;
    /**
     * 下架标识
     */
    public static final int PUT_FLAG_OFF = -1;

    /**
     * 文件服务器前缀
     */
    public static final String FILE_SERVER_PREFIX = "http://60.174.195.181";

    public static final int CALENDAR_SET_DAYS_LIMIT = 3;
    /**
     * 图片标识
     */
    public static final int DESC_TYPE_IMG = 1;
    /**
     * 文本标识
     */
    public static final int DESC_TYPE_TXT = 0;
    /**
     * 游记 - 抓取状态
     */
    public static final int NOTES_STATUS_INIT = 0 ;
    /**
     * 游记 - 发布状态
     */
    public static final int NOTES_STATUS_PUBLISH = 1;
    /**
     * 游记 - 下架状态
     */
    public static final int NOTES_STATUS_OFF = -1;
    /**
     * 游记 - 删除状态
     */
    public static final int NOTES_STATUS_DEL = -2;
    /**
     * 足迹 - 管理员删除
     */
    public static final int FOOTMARK_STATUS_DEL = 2;
    /**
     * 专题 - 编辑完成
     */
    public static final int SUBJECT_STATUS_INIT = 0;
    /**
     * 专题 - 发布
     */
    public static final int SUBJECT_STATUS_PUBLISH = 1;
    /**
     * 专题 - 下线
     */
    public static final int SUBJECT_STATUS_OFF = -1;
    /**
     * 管理员删除
     */
    public static final int SUBJECT_STATUS_DEL = -2;
    public static final int STATUS_EMPTY = -9999;
}
