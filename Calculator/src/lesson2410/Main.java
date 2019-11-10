package lesson2410;

import java.sql.Date;;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lesson2410.Informato.findCar;

public class Main {
    public static final int JOURNAL_CAPACITY = 1000;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(JOURNAL_CAPACITY);
        List<Car> cars = new ArrayList<>();
        List<Owner> owners = new ArrayList<>();
        String line;
        while (true){
            line = sc.nextLine();
            if(line.equals("1")){
                System.out.println("Номер");
                line = sc.nextLine();
                Car car = new Car(line);
                cars.add(car);
            }
            else if(line.equals("2")){
                System.out.println("Имя");
                line = sc.nextLine();
                System.out.println("Фамилия");
                String l = sc.nextLine();
                Owner owner = new Owner(line,l, new Date(System.currentTimeMillis()));
                owners.add(owner);
            }
            else if(line.equals("3")){
                System.out.println("Введите номер");
                line = sc.nextLine();
                Car car = findCar(cars,line);
                if(car != null){
                    System.out.println(Informato.getCarInfo(car));
                }
                else{
                    System.out.println("Такого номера нет");
                }
            }
            else if(line.equals("4")){
                System.out.println("Введите имя владельца");
                line = sc.nextLine();
                Owner owner = Informato.findOwner(owners,line);
                System.out.println("Введите номер машины");
                line = sc.nextLine();
                Car car = findCar(cars, line);
                car.setOwner(owner);
            }
            else if(line.equals("5")){
                System.out.println("Введите номер машины");
                line = sc.nextLine();
                Owner owner = Informato.findCarOwner(cars, line);
                System.out.println(owner);

            }
        }
    }
}
