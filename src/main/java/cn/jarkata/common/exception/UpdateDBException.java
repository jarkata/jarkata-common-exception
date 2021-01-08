package cn.jarkata.common.exception;

/**
 * 更新数据异常
 */
public class UpdateDBException extends DBException {

    public UpdateDBException(String code, String message) {
        super(code, message);
    }
}
