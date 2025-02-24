package src.exception.ex2;



public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://exaple.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //에러 체크 추가

        client.connet(); //연결
        client.send(data); //데이터 전송
        client.disconnect(); //연결 해제
    }


}
