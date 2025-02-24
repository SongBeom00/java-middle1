package src.exception.basic.checked;

public class CheckedCatchMain {


    // 1. main() -> service.callCatch() -> client.call() [예외 발생, 던짐]
    // 2. main() <- service.callCatch() [예외 처리] <- client.call()
    // 3. main() [정상 흐름] <- service.callCatch() <- client.call()

    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }





}
