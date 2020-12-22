package com.example.frameworkstudy.handler;



import com.example.frameworkstudy.common.Const;
import com.example.frameworkstudy.common.Response;
import com.example.frameworkstudy.exception.AuthorityException;
import com.example.frameworkstudy.exception.ServiceException;
import com.example.frameworkstudy.exception.SessionTimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

/**
 * 异常处理
 *
 * @author liuqiang
 */
public class ErrorHandler extends BaseHandler {
    private static Logger logger = LoggerFactory.getLogger(ErrorHandler.class);

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Response exceptionMissingServletRequestParameterError(MissingServletRequestParameterException e) {
        Response bean = new Response();
        bean.setCode(Const.STATUS_FAILED);
        bean.setMsg(e.getMessage());
        logger.error(e.getMessage(), e);
        return bean;
    }

    @ExceptionHandler(ServiceException.class)
    public Response exceptionServiceError(ServiceException exception) {
        Response bean = new Response();
        bean.setCode(Const.STATUS_FAILED);
        bean.setMsg(exception.getMessage());
        logger.error(exception.getMessage(), exception);
        return bean;
    }

    @ExceptionHandler(NullPointerException.class)
    public Response exceptionServiceError(NullPointerException exception) {
        Response bean = new Response();
        bean.setCode(Const.STATUS_NULL_ERROR);
        bean.setMsg(Const.TYPE_UNKNOWN_ERROR);
        logger.error(exception.getMessage(), exception);
        return bean;
    }

    @ExceptionHandler(Exception.class)
    public Response exceptionServiceError(Exception exception) {
        Response bean = new Response();
        bean.setCode(Const.STATUS_FATAL_ERROR);
        bean.setMsg(Const.TYPE_UNKNOWN_ERROR);
        logger.error(exception.getMessage(), exception);
        return bean;
    }

    @ExceptionHandler(SessionTimeoutException.class)
    public Response exceptionServiceError(SessionTimeoutException exception) {
        Response bean = new Response();
        bean.setCode(Const.STATUS_LOGIN_TIMEOUT_ERROR);
        bean.setMsg(exception.getMessage());
        return bean;
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public Object baseExceptionErrorHandler(Exception e) {
        MethodArgumentNotValidException ex = (MethodArgumentNotValidException) e;
        BindingResult bindingResult = ex.getBindingResult();
        //捕获的所有错误对象
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        ObjectError error = allErrors.get(0);
        //异常内容
        String defaultMessage = error.getDefaultMessage();
        logger.error(e.getMessage(), e);
        //打印日志
        Response bean = new Response();
        bean.setCode(Const.STATUS_FAILED);
        bean.setMsg(defaultMessage);
        return bean;
    }
    @ExceptionHandler(AuthorityException.class)
    public Response authorityExceptionError(Exception exception) {
        Response bean = new Response();
        bean.setCode(Const.AUTHORITY_EXCEPTION);
        bean.setMsg(Const.AUTHORITY_EXCEPTION_MSG);
        logger.error(exception.getMessage(), exception);
        return bean;
    }
}
