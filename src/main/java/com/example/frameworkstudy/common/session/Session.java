package com.example.frameworkstudy.common.session;






import com.example.frameworkstudy.common.Const;
import com.example.frameworkstudy.common.cache.CacheUtil;
import com.example.frameworkstudy.exception.CacheNotFoundException;
import com.example.frameworkstudy.exception.ServiceException;
import com.example.frameworkstudy.exception.SessionException;
import com.example.frameworkstudy.exception.SessionTimeoutException;
import com.example.frameworkstudy.util.serializer.json.SharpSerializer;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户SESSION
 *
 * @author liuqiang
 */
@Component
public class Session {
    @Autowired
    private CacheUtil cacheUtil;
    @Autowired
    private SessionConfig sessionConfig;
    @Autowired
    private SharpSerializer jsonSerializer;
    private Logger logger = LoggerFactory.getLogger(Session.class);
    /**
    *设置用户SESSION
    *@author liuqiang
    *@method setAttribute
    *@param tokenId 令牌ID,当前用户
    *@return
    */
    public void setAttribute(String tokenId,User val) throws SessionException {
    if (StringUtils.isBlank(tokenId)) {
        throw new SessionException("pls give me a tokenId");
    }
    String json = jsonSerializer.serializer(val);
    cacheUtil.setEx(tokenId,sessionConfig.getTimeOut(),json);
    }

    /**
    *获取登录用户所有信息
    *@author liuqiang
    *@method getAttribute
    *@param tokenId 令牌ID
    *@return 返回当前登陆用户
    */
    public User getAttribute(String tokenId) throws SessionException, SessionTimeoutException {
        if (StringUtils.isBlank(tokenId)) {
            throw new SessionException("pls give me a tokenId");
        }
        User user = null;
        try {
            String content = cacheUtil.get(tokenId,sessionConfig.getTimeOut());
            user =jsonSerializer.deserializer(content,User.class);
        } catch (CacheNotFoundException e) {
            throw new SessionTimeoutException(Const.LOGIN_TIME_OUT);
        }
        return user;
    }
    /**
     *获取登录用户某个信息
     *@author liuqiang
     *@method getAttribute
     *@param tokenId 令牌ID
     *@return 返回当前登陆用户
     */
    public String getAttribute(String tokenId,String attrName) throws SessionException, SessionTimeoutException {
        if (StringUtils.isBlank(tokenId)) {
            throw new SessionException("pls give me a tokenId");
        }
        if (StringUtils.isBlank(attrName)) {
            throw new SessionException(attrName+" not exist");
        }
        String userAttr = null;
        try {
            userAttr = cacheUtil.getVal(tokenId,attrName,sessionConfig.getTimeOut());
        } catch (CacheNotFoundException e) {
            throw new SessionTimeoutException(Const.LOGIN_TIME_OUT);
        }
        return userAttr;
    }
    /**
    *删除SESSION
    *@author liuqiang
    *@method remove
    *@param tokenId 令牌ID
    *@return
    */
    public void remove(String tokenId)throws SessionException {
        if (StringUtils.isBlank(tokenId)) {
            throw new SessionException("pls give me a tokenId");
        }
        try {
            cacheUtil.del(tokenId);
        } catch (ServiceException e) {
            logger.error(e.getMessage(),e);
            throw new SessionException(e.getMessage());
        }
    }
    /**
    *检查该登陆用户是否存在
    *@author liuqiang
    *@method isValid
    *@param tokenId
    *@return 返回TRUE则存在
    */
    public boolean isValid(String tokenId) throws SessionException {
        if (StringUtils.isBlank(tokenId)) {
            logger.error("没有找到tokenId");
            throw new SessionException("没有找到tokenId");
        }
        Boolean flag = false;
        try {
            flag = cacheUtil.exist(tokenId);
            if(flag) {
                cacheUtil.expire(tokenId,sessionConfig.getTimeOut());
            }
        } catch (ServiceException e) {
            throw new SessionException(e.getMessage());
        }
        return  flag;
    }
}
