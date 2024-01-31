package poly.basic;

// 다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain5 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    // parent 가 참조하는 타입에 따라서 다른 명령을 수행한다.
    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.parentMethod();
        }
        // Pattern Matching for instanceof -> 다운캐스팅하는 코드를 생략할 수 있다.
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.parentMethod();
        }
    }
}
