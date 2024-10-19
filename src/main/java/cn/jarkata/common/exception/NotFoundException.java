package cn.jarkata.common.exception;

/**
 * 未找到数据时的异常
 */
public class NotFoundException extends BaseException {

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }

    public NotFoundException(ErrorCode errorCode, Throwable ex) {
        super(errorCode, ex);
    }

    public NotFoundException(String code, String message) {
        super(code, message, null, false);
    }

    public NotFoundException(String code, String message, Throwable cause) {
        super(code, message, cause, false);
    }

}
