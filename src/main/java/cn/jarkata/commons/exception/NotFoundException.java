package cn.jarkata.commons.exception;

public class NotFoundException extends BaseException {

    public NotFoundException(String code, String message) {
        super(code, message);
    }
}
