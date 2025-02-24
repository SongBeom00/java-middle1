package src.exception.ex2;



public class NetworkServiceV2_2 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //에러 체크 추가

        try {
            client.connet(); //연결
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: "+ e.getMessage());
            return; //send() 를 호출하지 못하게 return 합니다.
        }

        try {
            client.send(data); //데이터 전송
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: "+ e.getMessage());
            return;
        }
        client.disconnect(); //연결 해제
    }


}
