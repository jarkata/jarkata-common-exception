package cn.jarkata.common.exception;

public class UpdateDbException extends BaseException {

    public UpdateDbException(String code, String message) {
        super(code, message, null, false);
    }

    public UpdateDbException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
