package com.example.frameworkstudy.util;



import com.example.frameworkstudy.exception.ServiceException;

import java.util.Objects;

public class TypeUtils {

    public static Integer castToInt(Object value) {
        if (value == null) {
            return null;
        }

        if (value instanceof Integer) {
            return (Integer) value;
        }

        if (value instanceof Number) {
            return ((Number) value).intValue();
        }

        if (value instanceof String) {
            String strVal = (String) value;

            if (strVal.length() == 0
                    || "null".equals(strVal)
                    || "NULL".equals(strVal)) {
                return null;
            }

            if (strVal.indexOf(',') != 0) {
                strVal = strVal.replaceAll(",", "");
            }

            return Integer.parseInt(strVal);
        }

        if (value instanceof Boolean) {
            return (Boolean) value ? 1 : 0;
        }

        throw new ServiceException("can not cast to int, value : " + value);
    }

    public static Integer castToInt(Object value, Integer defaults) {
        Integer castToInt = castToInt(value);
        return Objects.isNull(castToInt) ? defaults : castToInt;

    }
    public static Boolean castToBoolean(Object value) {
        if (value == null) {
            return null;
        }

        if (value instanceof Boolean) {
            return (Boolean) value;
        }

        if (value instanceof Number) {
            return ((Number) value).intValue() == 1;
        }

        if (value instanceof String) {
            String strVal = (String) value;

            if (strVal.length() == 0
                    || "null".equals(strVal)
                    || "NULL".equals(strVal)) {
                return null;
            }

            if ("true".equalsIgnoreCase(strVal)
                    || "1".equals(strVal)) {
                return Boolean.TRUE;
            }

            if ("false".equalsIgnoreCase(strVal)
                    || "0".equals(strVal)) {
                return Boolean.FALSE;
            }
        }

        throw new ServiceException("can not cast to boolean, value : " + value);
    }

    public static Boolean castToBoolean(Object value, Boolean defaults) {
        Boolean castToBoolean = castToBoolean(value);
        return Objects.isNull(castToBoolean) ? defaults : castToBoolean;

    }
}
