package extends1.ex3;

public class ElectricCar extends Car {

    // Override 애노테이션은 생략해도 되지만, 어떤 표시임
    // method가 override를 하지 않았다면 컴파일 오류를 내준다!
    // 개발자 입장에서는 실수하지 않을 수 있는 제약을 만들어줌
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge() {

        System.out.println("충전합니다.");
    }
}
