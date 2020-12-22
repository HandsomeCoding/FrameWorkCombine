package com.example.frameworkstudy.util.convert;

import java.io.Serializable;

public class Convert implements Serializable {
    /**
     * 获取自动转换后的JavaBean对象
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T convert(Class<T> clazz) {
        return BeanConverter.convert(clazz, this);
    }
}
