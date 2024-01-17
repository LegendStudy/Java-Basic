package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);
        // 생성자 초기화의 경우, 인스턴스 별로 다른 값을 사용할 수 있다

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        // 필드 초기화의 경우, 모든 인스턴스가 같은 값을 사용
        // 중복 값이 반복해서 생성되어 메모리 낭비 발생

        // static으로 해결한다. 공유하는 Field!
        // 상수 -> static final이 붙은 변수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        // final + 필드 초기화를 사용할 경우, static을 붙여서 상수로 만드는 것이 효과적


        double pi = Constant.PI;
    }
}
