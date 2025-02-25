package src.exception.ex4;


import src.exception.ex4.exception.ConnectExceptionV4;
import src.exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); //에러 체크 추가

        try { //정상 흐름
            client.connet(); //연결
            client.send(data); //데이터 전송
        }
        finally {
            client.disconnect(); //연결 해제
        }


//        try {
//            client.connet();
//            client.send(data);
//        }catch (ConnectExceptionV3 | SendExceptionV3 e){ //단점 공통의 부모 기능만 사용할 수 있다. -> 자식의 메서드 사용 불가능
//            System.out.println(e.getMessage());
//        }
//        finally {
//            client.disconnect();
//        }


    }


}
