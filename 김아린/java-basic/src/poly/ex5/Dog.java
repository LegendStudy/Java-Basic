package poly.ex5;

public class Dog implements InterfaceAnimal {
    // implements == 구현
    // 내가 다 구현해야 하는 기능!
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
