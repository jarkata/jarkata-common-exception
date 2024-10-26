package cn.jarkata.common.exception;

/**
 * 未找到数据时的异常
 */
public class NotFoundException extends BaseException {

    public NotFoundException(ResponseCode responseCode) {
        super(responseCode);
    }

    public NotFoundException(ResponseCode responseCode, Throwable ex) {
        super(responseCode, ex);
    }

    public NotFoundException(String code, String message) {
        super(code, message, null, false);
    }

    public NotFoundException(String code, String message, Throwable cause) {
        super(code, message, cause, false);
    }

}
