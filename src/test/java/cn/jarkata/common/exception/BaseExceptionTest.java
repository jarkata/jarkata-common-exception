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

    @Test
    public void testException() {
        long start = System.currentTimeMillis();
        for (int index = 0; index < 100000000; index++) {
            try {
                throw new NotFoundException("", "");
            } catch (Exception ignored) {
            }
        }
        System.out.println(System.currentTimeMillis() - start);

        long startstr = System.currentTimeMillis();
        for (int index = 0; index < 100000000; index++) {
            new String("1234".getBytes());
        }
        System.out.println(System.currentTimeMillis() - startstr);
    }

}