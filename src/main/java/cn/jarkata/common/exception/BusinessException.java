package cn.jarkata.common.exception;

/**
 * 业务异常
 */
public class BusinessException extends RuntimeException implements BaseException {

    private final String code;

    public BusinessException(ResponseCode responseCode) {
        this(responseCode, null, false);
    }

    public BusinessException(ResponseCode responseCode, Throwable ex) {
        this(responseCode, ex, true);
    }

    public BusinessException(ResponseCode responseCode, String message) {
        this(responseCode, null, false);
    }

    public BusinessException(ResponseCode responseCode, String message, Throwable cause) {
        this(responseCode.getCode(), message, cause, true);
    }

    public BusinessException(ResponseCode responseCode, Throwable cause, boolean writableStackTrace) {
        this(responseCode.getCode(), responseCode.getMessage(), cause, writableStackTrace);
    }

    /**
     * 不输出堆栈信息输出
     *
     * @param responseCode 响应吗
     * @return 异常信息
     */
    public static BusinessException newException(ResponseCode responseCode) {
        return new BusinessException(responseCode, null, false);
    }

    /**
     * 自定义业务异常
     *
     * @param code    错误码
     * @param message 错误信息
     */
    public BusinessException(String code, String message) {
        this(code, message, null, false);
    }

    public BusinessException(String code, String message, Throwable cause) {
        this(code, message, cause, true);
    }

    public BusinessException(String code, String message, Throwable cause, boolean writableStackTrace) {
        super(message, cause, false, writableStackTrace);
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return "[" + code + "]" + super.getMessage();
    }
}
