package poly.ex5;

/**
 * 인터페이스는 여러 군데에서 사용하는 목적으로 만들어져서 접근제어자는 public 을 사용하고 있다.
 * 인터페이스는 모든 메서드가 추상 메서드이다.
 * 물려받을 수 기능이 없고 인터페이스에서 정의한 모든 메서드를 반드시 자식이 오버라이딩 해서 기능을 구현 해야 한다.
 * 하위 클래스는 메서드들을 "구현" 해야 한다.
 * 인터페이스를 사용 하는 이유
 * 1. 제약 (인터페이스의 메서드는 반드시 구해라는 규약(제약)을 주는
 * 2. 다중 구현 (클래스 상속은 단일 상속만 가능)
 */
public interface InterfaceAnimal {
    void sound(); //public abstract 가 생략 되어 있다.
    void move(); //public abstract 가 생략 되어 있다.
}
