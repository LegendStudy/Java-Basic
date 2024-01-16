package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근,
        // compile error //instanceMethod();
        // 인스턴스 메서드 접근, compile error
        staticValue++; //static 변수 접근, ok
        staticMethod(); //static 메서드 접근, ok
    }
    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근, ok
        instanceMethod(); //인스턴스 메서드 접근, ok
        staticValue++; //static 변수 접근, ok
        staticMethod(); //static 메서드 접근, ok
    }
    public static void staticMethod() {
        System.out.println("staticMethod");
    }
    public void instanceMethod() {
        System.out.println("instanceMethod");
    }
}
