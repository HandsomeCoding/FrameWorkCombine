package com.example.frameworkstudy.common.cache;



import com.store.tianmao.exception.CacheNotFoundException;
import com.store.tianmao.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 * 缓存API
 *
 * @author PC043
 *
 */
@Component
public class CacheUtil {// 和官方命令一样的格式，方便查询，具体请查询http://doc.redisfans.com/，没有写完，需要时再补充
    @Autowired
    protected CachePool cachePool;
    
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 将值 value 关联到 key ，并将 key 的生存时间设为 seconds (以秒为单位)。 如果 key 已经存在， SETEX
     * 命令将覆写旧值。
     *
     * @param key
     *            key
     * @param expireSecond
     *            超时时间,以秒为单位
     * @param value
     *            值
     * @throws ServiceException
     */

    public void setEx(String key, int expireSecond, String value) throws ServiceException {// 这里似乎可以AOP
        Jedis jedis = null;
        try {
            jedis = cachePool.getPool().getResource();
            jedis.setex(key, expireSecond, value);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw new ServiceException("缓存出错，请查看错误日志");
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
    /**
     * 将值 value 关联到 key ，并将 key 的生存时间设为 seconds (以秒为单位)。 如果 key 已经存在， SETEX
     * 命令将覆写旧值。
     *
     * @param key
     *            key
     * @param expireSecond
     *            超时时间,以秒为单位
     *            值
     * @throws ServiceException
     */

    public String get(String key, int expireSecond) throws ServiceException {// 这里似乎可以AOP
        Jedis jedis = null;
        String content = "";
        try {
            jedis = cachePool.getPool().getResource();
            content = jedis.get(key);
            jedis.expire(key,expireSecond);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw new ServiceException("缓存出错，请查看错误日志");
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return content;
    }
    public String get(String key) throws ServiceException {// 这里似乎可以AOP
        Jedis jedis = null;
        String content = "";
        try {
            jedis = cachePool.getPool().getResource();
            content = jedis.get(key);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw new ServiceException("缓存出错，请查看错误日志");
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return content;
    }

    /**
     * 返回 key 所关联的字符串值。
     *
     * 如果 key 不存在那么返回特殊值 nil 。
     *
     * 假如 key 储存的值不是字符串类型，返回一个错误，因为 GET 只能用于处理字符串值。
     *
     * @param key
     * @return
     * @throws ServiceException
     */
    public boolean exist(String key) throws ServiceException {
        Jedis jedis = null;
        boolean result = false;
        try {
            jedis =  cachePool.getPool().getResource();
            result = jedis.exists(key);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw new ServiceException("缓存出错，请查看错误日志:"+ex.getMessage());
        } finally {
                if (jedis != null) {
                jedis.close();
            }
        }
        return result;

    }


    /**
     * 删除指定KEY
     *
     * @param key
     * @return 不等于0删除成功
     * @throws ServiceException
     */
    public Long del(String key) throws ServiceException {
        Jedis jedis = null;
        Long result = 0L;
        try {
            jedis = cachePool. getPool().getResource();
            result = jedis.del(key);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw new ServiceException(ex,"缓存出错，请查看错误日志");
        }
        finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return result;
    }

    /**
     * @Title: setMap
     * @Description: 批量存储HASH值
     * @param:  key
     * @param: val
     */
    public void setMap(String key ,Map<String,String> val,int expireSec) {
        Jedis jedis = null;
        try{
            jedis = cachePool. getPool().getResource();
            jedis.hmset(key,val);
            jedis.expire(key,expireSec);
        } catch (Exception ex) {
            logger.error(ex.getMessage(),ex);
            throw new CacheNotFoundException("缓存不存在");
        }finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
    /**
     * @Title: get4Map
     * @Description: 获取map中的某个值
     * @param:  key
     * @param: field
     * @return: Map<String,String>
     */
    public String get4Map(String key,String field,int expireSec)throws CacheNotFoundException {
        Jedis jedis = null;
        String val = null;
        try{
            jedis = cachePool. getPool().getResource();
            if (jedis == null || !jedis.exists(key)) {
                throw new CacheNotFoundException("缓存不存在");
            }else {
                val = jedis.hget(key,field);
                jedis.expire(key,expireSec);
            }
        } catch (Exception ex) {
            if(ex instanceof CacheNotFoundException) {
                throw new CacheNotFoundException("缓存不存在");
            }
            logger.error(ex.getMessage(),ex);
        }finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return val;
    }
    /**
     * @Title: getMap
     * @Description: 获取某个Key中的map,并延长生命周期
     * @param:  key
     * @param: field
     * @return: Map<String,String>
     */
    public Map<String,String> getMap(String key,int expireSec)throws CacheNotFoundException {
        Jedis jedis = null;
        Map<String,String> val = null;
        try{
            jedis = cachePool. getPool().getResource();
            if (jedis == null || !jedis.exists(key)) {
                throw new CacheNotFoundException("缓存不存在");
            }else {
                val = jedis.hgetAll(key);
                jedis.expire(key,expireSec);
            }
        } catch (Exception ex) {
            if(ex instanceof CacheNotFoundException) {
                throw new CacheNotFoundException("缓存不存在");
            }
            logger.error(ex.getMessage(),ex);
        }finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return val;
    }



    public String getVal(String key, String field,int expireSec)throws CacheNotFoundException {
        Jedis jedis = null;
        String val = null;
        try{
            jedis = cachePool. getPool().getResource();
            if (jedis == null || !jedis.exists(key)) {
                throw new CacheNotFoundException("缓存不存在");
            }else {
                val = jedis.hget(key,field);
                jedis.expire(key,expireSec);
            }
        } catch (Exception ex) {
            if(ex instanceof CacheNotFoundException) {
                throw new CacheNotFoundException("缓存不存在");
            }
            logger.error(ex.getMessage(),ex);
        }finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return val;
    }
    /**
     * @Title:  生存周期
     * @Description:  生存周期
     * @return:
     */
    public Long expire(String key,int timeOut){
        Jedis jedis = null;
        try {
            jedis = cachePool. getPool().getResource();
            if (jedis == null ) {
                return null;
            }else {
                return jedis.expire(key,timeOut);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw new ServiceException("缓存出错，请查看错误日志");
        }finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
