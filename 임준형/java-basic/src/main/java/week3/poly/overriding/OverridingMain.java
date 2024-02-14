package week3.poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println("------------");
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();

        System.out.println("------------");
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child 참조");
        System.out.println("value = " + poly.value); // parent, 변수는 오버라이딩이되지 않음
        poly.method();  // 메서드 오버라이딩, Child의 메서드 호출, 오버라이딩된 메서드가 항상 우선권을 가진다.
    }
}
