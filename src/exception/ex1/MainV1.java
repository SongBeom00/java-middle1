package src.exception.ex1;


import java.util.Scanner;


/**
 * NetworkServiceV1_1 문제점 파악
 * 1. 연결에 실패하면 데이터를 전송하지 않아야 하는데, 여기서는 데이터를 전송하고 있다.
 * 전송할 문자: error1
 * http://exaple.com 서버 연결 실패
 * http://exaple.com 서버에 데이터 전송: error1
 * http://exaple.com 서버 연결 해제
 * 2. 에러 발생 시에 오류 로그를 남겨야 한다.
 * NetworkServiceV1_2 문제점 파악
 * connect() 가 실패한 경우 send()를 호출하면 안된다. -> 해결하였음
 * 사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다. -> 해결 안됨
 * connect(), send() 호출에 오류가 있어도 disconnect()는 반드시 호출해야 한다. -> 계속 연결이 되어 있으면 네트워크 연결 자원이 고갈됩니다.
 * 전송할 문자: error2
 * http://exaple.com 서버 연결 성공
 * http://exaple.com 서버에 데이터 전송 실패: error2
 * [네트워크 오류 발생] 오류 코드: sendError
 * NetworkServiceV1_3
 * 사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다. -> 해결
 * connect(), send() 호출에 오류가 있어도 disconnect() 는 반드시 호출 된다.
 * 전송할 문자: error2
 * http://exaple.com 서버 연결 성공
 * http://exaple.com 서버에 데이터 전송 실패: error2
 * [네트워크 오류 발생] 오류 코드: sendError
 * http://exaple.com 서버 연결 해제
 *
 * 문제점 -> 정상 흐름과 예외 흐름이 분리 되어 있지 않다. 코드를 한눈에 이해하기 어렵다!!
 */
public class MainV1 {

    public static void main(String[] args) {
//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }


}
