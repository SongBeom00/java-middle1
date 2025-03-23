package poly.ex3;


public class AbstractMain {

    public static void main(String[] args) {
        //추상 클래스 생성 불가
//        AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) { //Animal이라는 추상적인 부모를 참조하고 있다!!
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
