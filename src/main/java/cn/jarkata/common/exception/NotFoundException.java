package cn.jarkata.common.exception;

public class NotFoundException extends BaseException {

    public NotFoundException(String code, String message) {
        super(code, message);
    }
}