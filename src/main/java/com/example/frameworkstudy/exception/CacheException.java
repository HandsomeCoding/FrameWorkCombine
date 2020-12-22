package com.example.frameworkstudy.exception;

/**
 * 缓存不存在异常
 */
public class CacheException extends RuntimeException{
    public CacheException(){
        super();
    }


    public CacheException(String msg){
        super(msg);
    }
    public CacheException(Throwable cause, String msg){super(msg,cause);}
}
