package poly.ex3;

/**
 * abstract가 붙은 추상 클래스이다 -> 해당 클래스는 직접 인스턴스 생성 불가능
 */
public abstract class AbstractAnimal {

    //추상 메서드가 하나라도 있으면 클래스에 abstract 키워드를 붙여 줘야 한다!!
    //상속 받은 자식이 반드시 오버라이딩 해서 사용해야 한다.
    //메서드 바디가 없다.
    public abstract void sound();

    //추상 메서드가 아니다.
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
