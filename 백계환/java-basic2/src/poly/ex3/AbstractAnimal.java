package poly.ex3;

// 추상 클래스 -> 인스턴스 생성할 수 없음. 다형성을 위한 클래스
public abstract class AbstractAnimal {

    // 추상 메서드 -> 자식이 꼭 오버라이딩 해야함.
    public abstract void sound();

    // 추상 메서드 아님 -> 자식이 꼭 오버라이딩 하지 않아도 됨.
    public void move() {
        System.out.println("동물이 움직입니다");
    }
}
