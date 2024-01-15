package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data;
        data = new Data();  // final Data data = new Data(); 와 같다
//        data = new Data(); // 참조형 변수에 참조값을 이미 할당했으므로 변경 불가
        // 이제 다른 값을 참조할 수 없음

        // 참조 대상의 객체 값은 변경 가능하다 (final이 아니므로)
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
