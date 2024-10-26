package cn.jarkata.common.exception;

/**
 * 更新数据异常
 */
public class UpdateDBException extends DBException {

    public UpdateDBException(ResponseCode responseCode) {
        super(responseCode);
    }

    public UpdateDBException(ResponseCode responseCode, Throwable ex) {
        super(responseCode, ex);
    }

    public UpdateDBException(String code, String message) {
        super(code, message);
    }

    public UpdateDBException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
