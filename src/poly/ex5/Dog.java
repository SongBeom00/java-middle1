package poly.ex5;

/**
 * interface 를 상속 받을 때는 -> implements (구현)
 * extends 는 클래스 일반 클래스는 추상 클래스에 사용 된다.
 */
public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
