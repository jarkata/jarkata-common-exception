package cn.jarkata.common.exception;

/**
 * 数据库异常
 */
public class DBException extends BusinessException {

    public DBException(ResponseCode responseCode) {
        super(responseCode);
    }

    public DBException(ResponseCode responseCode, String message) {
        super(responseCode, message);
    }

    public DBException(ResponseCode responseCode, Throwable ex) {
        super(responseCode, ex);
    }
}
