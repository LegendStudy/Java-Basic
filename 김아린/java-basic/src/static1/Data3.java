package static1;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name) {
        this.name = name;
        // Data3.count에서 Data3을 생략해도 괜찮음
        // 본인 클래스 이기 때문에
        count++;
    }
}
