package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); // 멤버 변수는 인스턴스가 만들어지면서 자동 초기화됨
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
