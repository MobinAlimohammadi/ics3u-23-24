package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        
        Car fastcar1 = new Car("Ferrari","SF90",2022,674.5);
        Car superfastcar1 = new Car("Buggati","Bolide",2020,1472.3);

        fastcar1.drive(1000.5);
        superfastcar1.printCarInfo();

    }
}
