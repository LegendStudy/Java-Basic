package week3.poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    @Override   // AbstractAnimal
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
