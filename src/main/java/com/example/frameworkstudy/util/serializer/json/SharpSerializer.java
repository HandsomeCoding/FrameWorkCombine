package com.example.frameworkstudy.util.serializer.json;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JsonSerializer
 * @Deacription TODO
 * @Author liuqiang
 * @Date 2020-08-25 17:01
 **/
@Component
public class SharpSerializer {

    /**
     * 功能描述: <br> 序列化
     * 〈〉
     * @Param: [object] 对象
     * @Return: java.lang.String
     * @Date: 2020/10/10 9:26
     */
    public   String serializer(Object object) {
        if (object==null) {
            return "";
        }
        return JSON.toJSONString(object);
    }
    /**
     * 功能描述: <br>
     * 〈反序列化〉
     * @Param: [JSON字符串, 序列化对象] 
     * @Return: T
     * @Date: 2020/10/10 9:28
     */
    
    public  <T> T deserializer(String json,Class<T> cls) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        return JSON.parseObject(json,cls);
    }
    /**
     * 功能描述: <br>
     * 〈〉
     * @Param: [json, cls]
     * @Return: java.util.List
     * @Date: 2020/10/10 13:45
     */

    public  List toArrayObject(String json,Class cls) {
        if (StringUtils.isEmpty(json)) {
            return new ArrayList();
        }
        return JSON.parseArray(json, cls);
    }
    
}
