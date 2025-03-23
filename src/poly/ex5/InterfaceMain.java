package poly.ex5;


public class InterfaceMain {

    public static void main(String[] args) {
        //인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();


        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(InterfaceAnimal animal) { //Animal이라는 추상적인 부모를 참조하고 있다!!
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
