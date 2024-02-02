package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("새새새새");
    }

    @Override
    public void fly() {
        System.out.println("새 날다");
    }
}
