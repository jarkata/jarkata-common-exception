package cn.jarkata.common.exception;

/**
 * 数据库异常
 */
public class DBException extends BaseException {

    public DBException(ResponseCode responseCode) {
        super(responseCode);
    }

    public DBException(ResponseCode responseCode, Throwable ex) {
        super(responseCode, ex);
    }

    public DBException(String code, String message) {
        super(code, message);
    }

    public DBException(String code, String message, Throwable cause) {
        super(code, message, cause, true);
    }
}
