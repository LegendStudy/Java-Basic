package week2.final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // fianl 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructorInit constructorInit1 = new ConstructorInit(10);
        ConstructorInit constructorInit2 = new ConstructorInit(20);

        System.out.println("constructorInit1.value = " + constructorInit1.value);
        System.out.println("constructorInit2.value = " + constructorInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FiledInit filedInit1 = new FiledInit();
        FiledInit filedInit2 = new FiledInit();
        FiledInit filedInit3 = new FiledInit();

        System.out.println(filedInit1.value);
        System.out.println(filedInit2.value);
        System.out.println(filedInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FiledInit.CONST_VALUE);


    }
}
