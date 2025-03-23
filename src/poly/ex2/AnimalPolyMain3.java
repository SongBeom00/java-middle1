package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Pig()}; //Pig에 메소드에 오버라이딩 하지 않을 경우
                                                                            // -> 부모 sound()가 호출된다.
        //변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) { //Animal이라는 추상적인 부모를 참조하고 있다!!
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
