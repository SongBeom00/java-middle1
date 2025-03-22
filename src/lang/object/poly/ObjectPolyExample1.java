package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); // 컴파일 에러 , Object 클래스에는 sound() 메서드가 없다.
        //obj.move(); // 컴파일 에러 , Object 클래스에는 move() 메서드가 없다.

        //객체에 맞는 다운 캐스팅이 필요하다
        if(obj instanceof Dog dog){
            dog.sound(); // Dog 클래스의 sound() 메서드를 호출한다.
        } else if (obj instanceof Car car){
            car.move(); // Car 클래스의 move() 메서드를 호출한다.
        }
    }

}
