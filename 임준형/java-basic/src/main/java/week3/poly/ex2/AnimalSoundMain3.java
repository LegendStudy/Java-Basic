package week3.poly.ex2;

import java.util.Arrays;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        Arrays.stream(animals).toList().forEach(AnimalSoundMain3::soundAnimal);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
