package cn.jarkata.common.exception.utils;

import cn.jarkata.common.exception.BusinessException;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionUtilsTest {

    @Test
    public void getErrorCode() {
        String errorMsg = ExceptionUtils.getErrorMsg(new RuntimeException("测试"));
        System.out.println(errorMsg);
        Assert.assertEquals("测试", errorMsg);
        String errorCode = ExceptionUtils.getErrorCode(new BusinessException("010", "测试"));
        System.out.println(errorCode);
        Assert.assertEquals("010", errorCode);
    }
}