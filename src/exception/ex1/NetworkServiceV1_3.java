package src.exception.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //에러 체크 추가

        String connetResult = client.connet();//연결
        //결과가 성공이 아니다 -> 오류다
        if (isError(connetResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+ connetResult);
        }else {
            String sendResult = client.send(data);//데이터 전송
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect(); //연결 해제 -> 무조건 disconnect() 가 호출할 수 있도록 코드를 수정 -> 네트워크 연결 자원이 고갈 되지 않도록
    }

    private static boolean isError(String connetResult) {
        return !connetResult.equals("success");
    }


}
