package cn.jarkata.common.exception.utils;

import cn.jarkata.commons.utils.ReflectionUtils;

public class ExceptionUtils {

    public static String getErrorMsg(Throwable ex) {
        Object getMessage = ReflectionUtils.invokeMethod(ex, "getMessage");
        return (String) getMessage;
    }

    public static String getErrorCode(Throwable ex) {
        Object getMessage = ReflectionUtils.invokeMethod(ex, "getCode");
        return (String) getMessage;
    }

}
