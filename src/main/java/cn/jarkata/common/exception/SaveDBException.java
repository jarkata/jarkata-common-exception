package cn.jarkata.common.exception;

/**
 * 保存数据异常
 */
public class SaveDBException extends DBException {

    public SaveDBException(ResponseCode responseCode) {
        super(responseCode);
    }

    public SaveDBException(ResponseCode responseCode, Throwable ex) {
        super(responseCode, ex);
    }

    public SaveDBException(String code, String message) {
        super(code, message);
    }

    public SaveDBException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
