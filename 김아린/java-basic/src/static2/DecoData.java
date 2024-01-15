package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++;    // 인스턴스 변수 접근, 컴파일 에러
//        instanceMethod();   // 인스턴스 메서드 접근, 컴파일 에러
        // 정적 메서드는 클래스 소속이다
        // 인스턴스 변수는 컴파일 이후 메모리가 생성되므로 호출 불가

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;    // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메서드 접근
        // 정적 메서드는 클래스 소속이다
        // 인스턴스 변수는 컴파일 이후 메모리가 생성되므로 호출 불가

        staticValue++; // 정적 변수 접근, Data.staticValue 와 같다
        staticMethod(); // 정적 메서드 접근, Data.staticMethod 와 같다
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
