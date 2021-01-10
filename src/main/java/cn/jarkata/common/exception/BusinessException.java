package cn.jarkata.common.exception;

/**
 * 业务异常
 */
public class BusinessException extends BaseException {

    /**
     * 自定义业务异常
     *
     * @param code    错误码
     * @param message 错误信息
     */
    public BusinessException(String code, String message) {
        super(code, message);
    }
}
