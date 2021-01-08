package cn.jarkata.common.exception;

import java.util.Objects;

/**
 * 基础异常
 */
public class BaseException extends RuntimeException {

    private String code;
    private String message;

    /**
     * 基础异常类
     *
     * @param code    错误代码
     * @param message 错误信息
     */
    public BaseException(String code, String message) {
        this(code, message, null);
    }

    /**
     * @param code    错误代码
     * @param message 错误信息
     * @param cause   上一次异常
     */
    public BaseException(String code, String message, Throwable cause) {
        this(code, message, cause, false);
    }

    /**
     * @param code               错误代码
     * @param message            错误信息
     * @param cause              继承至上一层异常
     * @param writableStackTrace 是否写堆栈
     */
    public BaseException(String code, String message, Throwable cause, boolean writableStackTrace) {
        super(code + "｜" + message, cause, false, writableStackTrace);
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
