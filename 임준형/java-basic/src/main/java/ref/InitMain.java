package ref;

public class InitMain {
    public static void main(String[] args) {
        // Class 속 변수의 기본 값은 자동으로 초기화 됨

        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
