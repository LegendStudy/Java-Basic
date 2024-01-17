package week2.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 정적 필드이므로 인스턴스에서 다시 stach 영역으로 돌아가서 접근함
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count); // 권장 x

        System.out.println("D count = " + Data3.count);
    }
}
