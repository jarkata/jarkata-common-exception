package cn.jarkata.common.exception;

/**
 * 基础异常
 */
public class SystemException extends RuntimeException implements BaseException {

    private final String code;

    public SystemException(ResponseCode responseCode) {
        this(responseCode, null, false);
    }

    public SystemException(ResponseCode responseCode, String message) {
        this(responseCode, message, null, false);
    }

    public SystemException(ResponseCode responseCode, Throwable ex) {
        this(responseCode, ex, true);
    }

    public SystemException(ResponseCode responseCode, String message, Throwable cause) {
        this(responseCode, message, cause, true);
    }

    public SystemException(ResponseCode responseCode, String message, Throwable cause, boolean writableStackTrace) {
        super(message, cause, false, writableStackTrace);
        this.code = responseCode.getCode();
    }

    public SystemException(ResponseCode responseCode, Throwable cause, boolean writableStackTrace) {
        super(responseCode.getMessage(), cause, false, writableStackTrace);
        this.code = responseCode.getCode();
    }

    /**
     * 基础异常类
     *
     * @param code    错误代码
     * @param message 错误信息
     */
    public SystemException(String code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * @param code    错误代码
     * @param message 错误信息
     * @param cause   上一次异常
     */
    public SystemException(String code, String message, Throwable cause) {
        this(code, message, cause, false);
    }

    /**
     * @param code               错误代码
     * @param message            错误信息
     * @param cause              继承至上一层异常
     * @param writableStackTrace 是否写堆栈
     */
    public SystemException(String code, String message, Throwable cause, boolean writableStackTrace) {
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
