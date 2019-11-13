import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Diesel diesel = new Diesel();
        ElectronicMotor tesla = new ElectronicMotor();
        Car car = new Car();
        Fuel fuel = new Fuel();
        car.maxSpeed();
        diesel.maxSpeed();
        tesla.maxSpeed();
        diesel.lowFuelConsumption();
        tesla.noiseLess();
        fuel.maxSpeed();
        fuel.HighMaxSpeed();
    }
}
