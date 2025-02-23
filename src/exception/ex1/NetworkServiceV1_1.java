package src.exception.ex1;


public class NetworkServiceV1_1 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //에러 체크 추가

        client.connet(); //연결
        client.send(data); //데이터 전송
        client.disconnect(); //연결 해제
    }


}
