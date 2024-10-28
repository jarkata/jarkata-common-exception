package cn.jarkata.common.exception;

/**
 * 业务异常
 */
public class BusinessException extends SystemException {

    public BusinessException(ResponseCode responseCode) {
        super(responseCode);
    }

    public BusinessException(ResponseCode responseCode, Throwable ex) {
        super(responseCode, ex);
    }

    public BusinessException(ResponseCode responseCode, String message) {
        super(responseCode, message);
    }

    public BusinessException(ResponseCode responseCode, String message, Throwable cause) {
        super(responseCode, message, cause);
    }

    public BusinessException(ResponseCode responseCode, Throwable cause, boolean writableStackTrace) {
        super(responseCode, cause, writableStackTrace);
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
        super(code, message);
    }

    public BusinessException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BusinessException(String code, String message, Throwable cause, boolean writableStackTrace) {
        super(code, message, cause, writableStackTrace);
    }
}
