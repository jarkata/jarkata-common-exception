package cn.jarkata.common.exception;

/**
 * 基础异常
 */
public class BaseException extends RuntimeException {

    private final String code;

    public BaseException(ResponseCode responseCode) {
        this(responseCode, null, false);
    }

    public BaseException(ResponseCode responseCode, Throwable ex) {
        this(responseCode, ex, true);
    }

    public BaseException(ResponseCode responseCode, Throwable cause, boolean writableStackTrace) {
        super(responseCode.getMessage(), cause, false, writableStackTrace);
        this.code = responseCode.getCode();
    }

    /**
     * 基础异常类
     *
     * @param code    错误代码
     * @param message 错误信息
     */
    public BaseException(String code, String message) {
        super(message);
        this.code = code;
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
        super(message, cause, false, writableStackTrace);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
