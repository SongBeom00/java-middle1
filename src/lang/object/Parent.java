package src.lang.object;

// 부모가 없으면 Object 클래스를 상속받는다.
public class Parent extends Object { // extends Object 생략 가능합니다. 컴파일러가 자동으로 추가합니다.

    public void parentMethod(){
        System.out.println("Parent.parentMethod()");
    }
}
