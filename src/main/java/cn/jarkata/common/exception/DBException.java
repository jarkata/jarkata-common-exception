package cn.jarkata.common.exception;

/**
 * 数据库异常
 */
public class DBException extends BaseException {

    public DBException(String code, String message) {
        super(code, message);
    }
}
