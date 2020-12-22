package com.example.frameworkstudy.exception;

/**
 * 登陆会话自定义异常
 */
public class SessionException extends RuntimeException{
    public SessionException(){
        super();
    }


    public SessionException(String msg){
        super(msg);
    }
    public SessionException(Throwable cause, String msg){super(msg,cause);}
}
