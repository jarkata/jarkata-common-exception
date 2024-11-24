package cn.jarkata.common.exception;

import java.util.Objects;

public class ValidateUtils {

    public static void throwBusiness(int result, ResponseCode responseCode) {
        if (result <= 0) {
            throw new BusinessException(responseCode);
        }
    }

    public static void throwDbException(int result, ResponseCode responseCode) {
        if (result <= 0) {
            throw new DBException(responseCode);
        }
    }

    public static void throwDbException(int result, ResponseCode responseCode, String message) {
        if (result <= 0) {
            throw new DBException(responseCode, message);
        }
    }

    public static void requireNonNull(Object object, ResponseCode responseCode) {
        if (Objects.isNull(object)) {
            throw new BusinessException(responseCode);
        }
    }

    public static void requireNonNull(Object object, ResponseCode responseCode, String message) {
        if (Objects.isNull(object)) {
            throw new BusinessException(responseCode, message);
        }
    }
}
