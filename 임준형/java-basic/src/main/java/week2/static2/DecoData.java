package week2.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근 가능
        /**
         * instance 접근 불가. static 은 static만 접근 가능
         * instanceValue++;
         * instanceMethod();
         */
    }

    public void instanceCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근 가능

        instanceValue++;
        instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
