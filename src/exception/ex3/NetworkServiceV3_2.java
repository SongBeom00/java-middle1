package src.exception.ex3;


import src.exception.ex3.exception.ConnectExceptionV3;
import src.exception.ex3.exception.NetworkClientExceptionV3;
import src.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data){
        String address = "http://exaple.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //에러 체크 추가

        try { //정상 흐름
            client.connet(); //연결
            client.send(data); //데이터 전송 -> SendExceptionV3
        } catch (ConnectExceptionV3 e) { //연결 오류만 잡는다. -> NetworkClientExceptionV3 순서를 바꾸면 안된다!!
            System.out.println("[연결 오류] 주소: "+e.getAddress()+", 메시지: "+e.getMessage());
        }catch (NetworkClientExceptionV3 e){
            System.out.println("[네트워크 오류] 메시지: "+ e.getMessage());
        }catch (Exception e){
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
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
