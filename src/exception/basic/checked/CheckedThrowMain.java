package src.exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료"); //예외를 잡아서 처리하지 못하고 밖으로 던지기만 해서 출력되지 않았다.
    }

    /*
      main 에서 해결하지 못해서 에러 발생
      Exception in thread "main" src.exception.basic.checked.MyCheckedException: ex
      	at src.exception.basic.checked.Client.call(Client.java:12) -> 1 예외 던짐
      	at src.exception.basic.checked.Service.catchThrow(Service.java:27) -> 2 예외 던짐
      	at src.exception.basic.checked.CheckedThrowMain.main(CheckedThrowMain.java:7) -> 3 예외 던짐
     */


}
