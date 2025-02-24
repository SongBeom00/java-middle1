package src.exception.basic.checked;

/**
 * throw 예외 라고 하면 새로운 예외를 발생시킬 수 있다. 예외도 객체이기 때문에 객체를 먼저 new로 생성하고 예외를 발생시켜야 한다.
 * throws 예외는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드이다.
 * throw, throws 의 차이에 주의 해야 한다!!
 */

public class Client {
    public void call() throws MyCheckedException {
        //문제 상황
        throw new MyCheckedException("ex");
    }

}
