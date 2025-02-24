package src.exception.basic.checked;

public class Service {

    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch(){
        try {
            client.call(); // throw new MyCheckedException("ex"); 예외가 날라온다.
            //Exception = MyCheckedException 부모는 자식의 예외를 잡을 수 있다.
        } catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message="+ e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
     * @throws MyCheckedException
     */
    public void catchThrow() throws MyCheckedException {
        client.call();
    }


}
