import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Car fordExplorer = new FordExplorer();
        Car maseratiLevante = new MaseratiLevante();
        Car car = new Car();
        car.maxSpeed();
        fordExplorer.maxSpeed();
        maseratiLevante.maxSpeed();
    }
}
