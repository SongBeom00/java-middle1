package src.exception.ex2;



public class NetworkServiceV2_3 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //에러 체크 추가

        try { //정상 흐름
            client.connet(); //연결
            client.send(data); //데이터 전송
            client.disconnect(); //연결 해제 -> 예외 발생 시에 호출 불가
        } catch (NetworkClientExceptionV2 e) { //예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: "+ e.getMessage());
        }


    }


}
