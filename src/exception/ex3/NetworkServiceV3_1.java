package src.exception.ex3;


import src.exception.ex3.exception.ConnectExceptionV3;
import src.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //에러 체크 추가

        try { //정상 흐름
            client.connet(); //연결
            client.send(data); //데이터 전송
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: "+e.getSendData() + ", 메시지: "+e.getMessage());
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+e.getAddress()+", 메시지: "+e.getMessage());
        } finally {
            client.disconnect(); //연결 해제
        }


    }


}
