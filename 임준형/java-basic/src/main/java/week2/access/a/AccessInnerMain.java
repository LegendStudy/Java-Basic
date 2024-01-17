package week2.access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public
        accessData.publicField = 1;
        accessData.publicMethod();

        // 같은 패키지 default 호출
        accessData.defaultField = 2;
        accessData.defaultMethod();

        // private 호출 불가

        accessData.innerAccess();
    }
}
