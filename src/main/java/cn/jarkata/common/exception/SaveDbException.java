package cn.jarkata.common.exception;

/**
 * 保存数据异常
 */
public class SaveDbException extends BaseException {

    public SaveDbException(String code, String message) {
        super(code, message, null, false);
    }

    public SaveDbException(String code, String message, Throwable cause) {
        super(code, message, cause, false);
    }
}
