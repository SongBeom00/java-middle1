package src.exception.ex4;


import src.exception.ex4.exception.ConnectExceptionV4;
import src.exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{

    private final String address; //접속할 외부 서버 주소
    public boolean connectError; //filed 는 기본값이 false 입니다.
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }


    public void connet(){ //외부 서버에 연결합니다.
        if (connectError){
            throw new ConnectExceptionV4(address,address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){ //연결한 외부 서버에 데이터를 전송합니다.
        if (sendError){
            throw new SendExceptionV4(data,address + " 서버에 데이터 전송 실패: " +data);
            //중간에 다른 예외가 발생했다고 가정
//            throw new RuntimeException("ex");
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: "+data);
    }

    public void disconnect(){ //외부 서버와 연결을 해제합니다.
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){ //error1 이라는 단어가 전송되면 서버 연결에 실패하도록 한다.
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }


    @Override //try 가 끝나면 자동으로 호출해준다.
    public void close(){ // throws Exception 자원을 반납하는 코드에서는 예외가 발생하지 않으므로 반드시 지워 준다!!!
        System.out.println("NetworkClientV5.close");
        disconnect();
    }



}
