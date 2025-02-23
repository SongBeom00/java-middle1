package src.exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connet(); //연결
        client.send(data); //데이터 전송
        client.disconnect(); //연결 해제
    }


}
