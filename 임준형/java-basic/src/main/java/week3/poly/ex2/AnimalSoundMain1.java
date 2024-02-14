package week3.poly.ex2;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        // 혼자해본 연습
        /*
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Animal caw1 = new Caw();
        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(cat1);
        animals.add(caw1);

        animals.forEach(animal -> soundAnimal(animal));
         */
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
