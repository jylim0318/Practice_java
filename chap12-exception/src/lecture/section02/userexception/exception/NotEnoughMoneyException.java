package lecture.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception {

    // 기본생성자
    public NotEnoughMoneyException() {
    }

    // 메시지를 받아서
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
