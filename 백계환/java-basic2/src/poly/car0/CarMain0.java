package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {

        K3Car k3Car = new K3Car();
        Drvier drvier = new Drvier();

        drvier.setK3Car(k3Car);
        drvier.drive();
    }
}
