package com.example.frameworkstudy.util;





import com.example.frameworkstudy.common.Const;
import com.example.frameworkstudy.common.Response;

import java.util.Random;
import java.util.UUID;

/**
 * 帮助类
 */
public class Helper {
    private static final int ALT = 1275;

    /**
     * 创建UUID
     *
     * @return uuid
     */
    public static String createUUID() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        return uuid;
    }

    /**
     * @param msg  提示信息
     * @param body 具体业务体
     * @return 响应体
     */
    public static <T> Response<T> packing(String msg, T body) {
        Response<T> Response = new Response<T>();
        Response.setCode(Const.STATUS_SUCESS);
        Response.setMsg(msg);
        Response.setBody(body);
        return Response;
    }

    /**
     * @param code 状态码
     * @param msg  提示信息
     * @param body 具体业务体
     * @return 响应体
     */
    public static <T> Response<T> packing(String code, String msg, T body) {
        Response<T> Response = new Response<T>();

        Response.setCode(code);
        Response.setMsg(msg);
        Response.setBody(body);
        return Response;
    }

    /**
     * @param body 具体业务体
     * @return 响应体
     */
    public static <T> Response<T> packing(T body) {
        Response<T> Response = new Response<T>();

        Response.setCode(Const.STATUS_SUCESS);
        Response.setMsg(Const.OPER_SUCCUESS);
        Response.setBody(body);
        return Response;
    }





    /**
     * MD5加密
     *
     * @param md5pwd md5密码
     * @param salt   盐
     * @return 密码
     */
    public static String encrypted(String md5pwd, int salt) {
        return MD5.getMD5Code(md5pwd + salt + ALT);
    }

    /**
     * MD5解密
     *
     * @param srcPwd 数据库存放密码
     * @param md5pwd md5密码
     * @param salt   盐
     * @return 验证通过返回true，验证不通过返回false
     */
    public static boolean decrypted(String srcPwd, String md5pwd, int salt) {
        String targetPwd = md5pwd + salt + ALT;
        targetPwd = MD5.getMD5Code(targetPwd);
        return targetPwd.equals(srcPwd);
    }

    /**
     * @return 生成随机值
     */
    public static int gen() {
        Random random = new Random();
        int randomVal = random.nextInt(999);
        return (randomVal + ALT) * 2;
    }
}
