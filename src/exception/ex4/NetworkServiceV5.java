package src.exception.ex4;


public class NetworkServiceV5 {

    public void sendMessage(String data){
        String address = "http://exaple.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)){ //정상 흐름
            client.initError(data); //추가
            client.connet(); //연결
            client.send(data); //데이터 전송
        }catch (Exception e){
            System.out.println("[예외 확인]: "+ e.getMessage());
            throw e;
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
