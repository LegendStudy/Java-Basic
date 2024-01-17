package week2.extends1.ex3;


public class CarMain {


    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        electricCar.openDoor();

        HydrozenCar hydrozenCar = new HydrozenCar();
        hydrozenCar.move();
        hydrozenCar.move();
        hydrozenCar.fillHydrogen();
        hydrozenCar.openDoor();
    }

}
