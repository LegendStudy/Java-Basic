package extends1.ex2;

import static2.ex.Car;

public class GasCar extends Car {
    public GasCar(String name) {
        super(name);
    }

    public void fillUp() { System.out.println("기름을 주유합니다.");
    }
}
