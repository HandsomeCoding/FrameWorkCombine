package com.example.frameworkstudy.exception;

/**
 * 会话超时或没有知道该缓存异常
 *
 */
public class SessionTimeoutException extends RuntimeException{
    public SessionTimeoutException(){
        super();
    }


    public SessionTimeoutException(String msg){
        super(msg);
    }
    public SessionTimeoutException(Throwable cause, String msg){super(msg,cause);}
}
