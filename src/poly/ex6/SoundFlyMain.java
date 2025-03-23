package poly.ex6;




public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird(); //Fly fly = new Bird(); 가능
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

//        flyAnimal(dog); //구현 불가
        flyAnimal(bird);
        flyAnimal(chicken);

    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) { //Animal이라는 추상적인 부모를 참조하고 있다!!
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }

}
