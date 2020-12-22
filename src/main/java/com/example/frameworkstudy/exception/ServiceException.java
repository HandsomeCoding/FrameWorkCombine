package com.example.frameworkstudy.exception;

/**
 * 自定义异常
 * @author liuqiang
 *
 */
public class ServiceException extends RuntimeException{
	public ServiceException(){
		super();
	}
	
	
	public ServiceException(String msg){
		super(msg);
	}
	public ServiceException(Throwable cause, String msg){super(msg,cause);}
}
