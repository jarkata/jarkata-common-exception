package cn.jarkata.common.exception;

public class IllegalArgumentException extends BusinessException {

    public IllegalArgumentException(ResponseCode responseCode) {
        super(responseCode);
    }

    public IllegalArgumentException(ResponseCode responseCode, String message) {
        super(responseCode, message);
    }
}
