package com.example.frameworkstudy.exception;

/**
 * 缓存不存在异常
 */
public class CacheNotFoundException extends RuntimeException{
    public CacheNotFoundException(){
        super();
    }


    public CacheNotFoundException(String msg){
        super(msg);
    }
    public CacheNotFoundException(Throwable cause, String msg){super(msg,cause);}
}
