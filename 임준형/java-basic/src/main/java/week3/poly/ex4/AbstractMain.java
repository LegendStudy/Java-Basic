package week3.poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        moveAnimal(dog);

        soundAnimal(cat);
        moveAnimal(cat);

        soundAnimal(caw);
        moveAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("테스트 시작");
        animal.sound();
        System.out.println("테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }
}
