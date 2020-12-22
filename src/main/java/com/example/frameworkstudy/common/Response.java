package com.example.frameworkstudy.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 给客户端响应的东西
 *
 * @author liuqiang
 */
@ApiModel(description = "响应实体类")
public class Response<T> {
    //业务代码，参见Const
    @ApiModelProperty("响应码")
    private String code;
    //业务信息
    @ApiModelProperty("响应信息")
    private String msg;
    //业务体
    @ApiModelProperty("业务内容")
    private T body;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", body=" + body +
                '}';
    }
}
