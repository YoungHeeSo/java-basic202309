package day07.exception;

public class LoginFailException extends Exception{
    // 커스텀 에러 클래스는
    // 기본 생성자와 에러메세지를 담는 생성자를 구현함

    public LoginFailException() {
    }

    public LoginFailException(String message) {
//        super(message);
    }
}
