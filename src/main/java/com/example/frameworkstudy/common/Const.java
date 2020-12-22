package com.example.frameworkstudy.common;

/**
 * 系统常量
 * @Author liuqiang
 */
public class Const {

    /**
     * RESPONSE代码
     */
    public final static String STATUS_SUCESS = "100";//成功
    public final static String STATUS_FAILED = "101";//失败
    public final static String STATUS_FATAL_ERROR = "102";//致命错误
    public final static String STATUS_NULL_ERROR = "103";//空异常
    public final static String STATUS_LOGIN_TIMEOUT_ERROR="104";//登陆超时
    public final static String AUTHORITY_EXCEPTION="105";//登陆超时

    public final static String OPER_SUCCUESS ="操作成功！";

    public final static String OPER_BREAKER ="出现失败，请重新操作";

    public final static String AUTHORITY_EXCEPTION_MSG="权限不足，请联系管理员。";
    /**
     * 业务异常信息
     */
    public final static String TYPE_UNKNOWN_ERROR="系统出错，请联系管理员!";
    public final static String TYPE_DATA_ERROR="非法数据格式!";
    /**=================== Login   ================* */

    public final static String LOGIN_TIME_OUT = "会话超时,请重新登录!";
    public final static String LOGIN_OUT = "退出成功!";
    public final static String LOGIN_ERROR_PSW = "用户名或密码错误!";
    public final static String LOGIN_UNABLE = "用户已被冻结!";
    public final static String LOGIN_ERROR_PWD = "密码错误!";

    /**===================   Operation   ==============*/

    public final static String REGISTER_FAILED ="注册失败！";
    public final static String REGISTER_SUCCUESS ="注册成功！";
    public final static String ADD_FAILED ="新增失败！";
    public final static String ADD_SUCCUESS ="新增失败！";
    public final static String USERNAME_EXISTS ="登录账号名已存在！";
    public final static String USERNAME_REPEAT ="存在重复的登录账号名!";
    public final static String USERNAME_NOT_EXISTS ="用户名不存在";
    public final static String WORKNO_NOT_EXISTS = "工号不存在";

    public final static Integer IMG_HEAD_EXPIRE=28800;

    /**===================   ReceiptInfo   ==============*/

    public final static String RECEIPTINFO_EXIST ="收货地址已存在!";
    public final static String RECEIPTINFO_NOT_EXIST ="收货地址不存在!";
    public final static String CUSTOMER_NOT_EXISTS ="客户不存在";
    public final static String CUSTOMER_ID ="请输入客户Id";

    /**===================   PyamentBank   ==============*/

    public final static String PYAMENTBANK_EXIST ="付款银行已存在!";
    public final static String PYAMENTBANK_NOT_EXIST ="付款银行不存在!";
    public final static String BANKACCOUNT_EXIST ="付款银行账户已存在!";
    public final static String OPENING_BANK_ERROR ="开户行错误或请填写完整地址!";


    /**===================   DataField   ==============*/

    public final static String PLEASE_CHOOSE ="请选择!";
    public final static String DATAFIELD_EXIST ="数据字典已存在!";
    public final static String DATAFIELD_NOT_EXIST ="数据字典不存在!";
    public final static String IMPORT_ID ="请输入Id!";


    /**===================   OtherInfo   ==============*/

    public final static String SOFTWATE_EXIST ="信息已存在!";
    public final static String SOFTWATE_NOT_NULL ="信息或版本号不能为空!";

}
