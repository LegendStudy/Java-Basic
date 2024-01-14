package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        PublicClass.DefaultClass1 class1 = new PublicClass.DefaultClass1();
        PublicClass.DefaultClass2 class2 = new PublicClass.DefaultClass2();
    }
}
