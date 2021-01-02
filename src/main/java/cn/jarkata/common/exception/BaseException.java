package cn.jarkata.common.exception;

import java.util.Objects;

public class BaseException extends RuntimeException {

    private String code;
    private String message;

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        if (Objects.isNull(message)) {
            return this.getMessage();
        }
        return this.message;
    }
}
