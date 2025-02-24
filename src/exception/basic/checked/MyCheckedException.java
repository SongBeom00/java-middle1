package src.exception.basic.checked;

/**
 * Exception 을 상속받은 예외는 체크 예외가 된다.
 */


public class MyCheckedException extends Exception{

    public MyCheckedException(String message) {
        super(message);  //Throwable -> String detailMessage 에 에러 메시지가 보관이 됩니다.
    }
}
