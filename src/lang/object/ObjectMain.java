package src.lang.object;

/**
 * 자바에서의 모든 클래스는 Object 클래스를 상속받는다.
 * Object 클래스는 모든 클래스의 최상위 클래스이다.
 * Object 클래스의 메서드를 자식 클래스에서 오버라이딩 할 수 있다.
 * Object 클래스의 메서드를 오버라이딩 하지 않으면 부모 클래스의 메서드를 사용한다.
 */
public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // Object 클래스의 toString() 메서드를 호출한다.
        String string = child.toString();
        System.out.println("string = " + string);
    }
}
