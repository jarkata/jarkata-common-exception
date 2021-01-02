package cn.jarkata.common.exception;

import org.junit.Test;

public class BaseExceptionTest {

    @Test
    public void test() {
        try {
            throw new IllegalArgumentException("参数失败");
        } catch (Exception ex) {
            BaseException baseException = new BaseException("e", ex.getMessage(), ex);
            String message = baseException.getMessage();
            System.out.println(message);
        }
    }

    @Test
    public void testBaseException() {
        BaseException baseException = new BaseException("e", "ces");
        String message = baseException.getMessage();
        System.out.println(message);
    }

}