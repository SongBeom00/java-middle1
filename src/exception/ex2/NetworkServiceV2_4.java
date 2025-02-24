package src.exception.ex2;



public class NetworkServiceV2_4 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //에러 체크 추가

        try { //정상 흐름
            client.connet(); //연결
            client.send(data); //데이터 전송 -> throw new RuntimeException("ex"); 언체크 예외 자동으로 밖으로 던진다.
            //1. RuntimeException은 catch 대상이 아님. 예외가 밖으로 던져짐
        } catch (NetworkClientExceptionV2 e) { //예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: "+ e.getMessage());
        }

        client.disconnect(); //연결 해제
        //2. 이 코드는 호출되지 않음

    }


}
