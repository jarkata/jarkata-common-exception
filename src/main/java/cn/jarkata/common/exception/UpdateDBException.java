package cn.jarkata.common.exception;

/**
 * 更新数据异常
 */
public class UpdateDBException extends DBException {

    public UpdateDBException(ErrorCode errorCode) {
        super(errorCode);
    }

    public UpdateDBException(ErrorCode errorCode, Throwable ex) {
        super(errorCode, ex);
    }

    public UpdateDBException(String code, String message) {
        super(code, message);
    }

    public UpdateDBException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
