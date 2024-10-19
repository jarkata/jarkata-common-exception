package cn.jarkata.common.exception;

/**
 * 业务异常
 */
public class BusinessException extends BaseException {


    public BusinessException(ErrorCode errorCode) {
        super(errorCode);
    }

    public BusinessException(ErrorCode errorCode, Throwable ex) {
        super(errorCode, ex);
    }

    /**
     * 自定义业务异常
     *
     * @param code    错误码
     * @param message 错误信息
     */
    public BusinessException(String code, String message) {
        super(code, message);
    }

    public BusinessException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BusinessException(String code, String message, Throwable cause, boolean writableStackTrace) {
        super(code, message, cause, writableStackTrace);
    }
}
