package poly.ex4;

/**
 * abstract가 붙은 추상 클래스이다 -> 해당 클래스는 직접 인스턴스 생성 불가능
 * 순수 추상 클래스이다. 모든 메서드가 abstract 키워드가 있다.  -> 기능 구현이 없다.
 * 다형성을 위한 부모 타입으로 껍데기 역할만 제공 한다.
 *
 * 특징
 * 1. 인스턴스를 생성할 수 없다.
 * 2. 상속 시 자식은 모든 메서드를 오버라이딩 해야 한다.
 * 3. 주로 다형성을 위해 사용된다.
 * 상속은 부모의 기능을 사용하기 위해 쓰지만
 * 추상화는 부모의 기능이 없어 자식이 기능을 구현 해야 한다 (규격에 맞추어 구현)
 * 자식 별로 기능은 다를 수도 있다.
 */
public abstract class AbstractAnimal {

    public abstract void sound();
    public abstract void move();
}
