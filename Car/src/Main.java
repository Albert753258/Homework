import java.io.*;
import java.sql.Date;;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Car> cars = new ArrayList<>();
    public static List<Owner> owners = new ArrayList<>();
    public static final int JOURNAL_CAPACITY = 1000;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        loadOwners();
        loadCars();
        String line;
        System.out.println("Введите `help`");
        while (true){
            line = sc.nextLine();
            if(line.equals("help")){
                System.out.println("Чтобы создать машину, введите `1`");
                System.out.println("Чтобы создать владельца, введите `2`");
                System.out.println("Чтобы найти машину, введите `3`");
                System.out.println("Чтобы привязать владельца к машине, введите `4`");
                System.out.println("Чтобы вывести информацию о том, кто владеет этой машиной, введите `5`");
                System.out.println("Чтобы создать машину, владельца и привязать их, введите `6`");
            }
            else if(line.equals("1")){
                System.out.println("Номер");
                line = sc.nextLine();
                Car car = new Car(line);
                cars.add(car);
                writeCars(cars);
            }
            else if(line.equals("2")){
                System.out.println("Имя");
                line = sc.nextLine();
                System.out.println("Фамилия");
                String l = sc.nextLine();
                Owner owner = new Owner(line,l);
                owners.add(owner);
                writeOwners(owners);
            }
            else if(line.equals("3")){
                System.out.println("Введите номер");
                line = sc.nextLine();
                Car car = Informato.findCar(cars,line);
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
                Car car = Informato.findCar(cars, line);
                car.setOwner(owner);
            }
            else if(line.equals("5")){
                System.out.println("Введите номер машины");
                line = sc.nextLine();
                Owner owner = Informato.findCarOwner(cars, line);
                System.out.println(Informato.getOwnerInfo(owner));
            }
            else if(line.equals("6")){
                System.out.println("Имя");
                line = sc.nextLine();
                System.out.println("Фамилия");
                String line1 = sc.nextLine();
                Owner owner = new Owner(line,line1);
                owners.add(owner);
                System.out.println("Номер");
                String line2 = sc.nextLine();
                Car car = new Car(line2);
                cars.add(car);
                Owner owner1 = Informato.findOwner(owners,line);
                Car car1 = Informato.findCar(cars, line2);
                car1.setOwner(owner1);
            }
        }
    }
    public static void loadOwners() throws FileNotFoundException {
        String s;
        Scanner sc1 = new Scanner(new File("owners.txt"));
        s = sc1.nextLine();
        String[] s1;
        while (sc1.hasNextLine()) {
            s1 = s.split(" ");
            owners.add(new Owner(s1[0], s1[1]));
            s = sc.nextLine();
        }
        s1 = s.split(" ");
        owners.add(new Owner(s1[0], s1[1]));
    }
    public static void loadCars() throws FileNotFoundException {
        Car[] current;
        Scanner sc1;
        String s;
        sc1 = new Scanner(new File("cars.txt"));
        s = sc1.nextLine();
        String[] s1;
        while (sc1.hasNextLine()) {
            s1 = s.split(" ");
            cars.add(new Car(s1[0]));
            s = sc.nextLine();
        }
        s1 = s.split(" ");
        cars.add(new Car(s1[0]));
    }
    public static void writeCars(List<Car>  cars) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("cars.txt")),true);
        for(Car car: cars){
            printWriter.println(car.getNumber());
        }
        printWriter.close();
    }
    public static void writeOwners(List<Owner>  owners) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("owners.txt")),true);
        for(Owner owner: owners){
            printWriter.println(owner.getName() + " " + owner.getSurname());
        }
        printWriter.close();
    }
}
