package cn.jarkata.common.exception;

import java.util.Objects;

public class BaseException extends RuntimeException {

    private String code;
    private String message;

    public BaseException(String code, String message) {
        this(code, message, null);
    }

    public BaseException(String code, String message, Throwable cause) {
        this(code, message, cause, true);
    }

    public BaseException(String code, String message, Throwable cause, boolean writableStackTrace) {
        super(message, cause, false, writableStackTrace);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        if (Objects.isNull(message)) {
            return super.getMessage();
        }
        return this.message;
    }
}
