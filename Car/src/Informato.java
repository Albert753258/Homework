import java.util.List;

public class Informato {
    private static int numberOfCallsCarInfo = 0;
    private static int numberOfCallsOwnerInfo = 0;
    public static String getCarInfo(Car car){
        numberOfCallsCarInfo++;
        return "" + car.getNumber() + " " + car.getMarkaaa();
    }
    public static String getOwnerInfo(Owner owner){
        numberOfCallsOwnerInfo++;
        return "" + owner.getName() + " " + owner.getSurname();
    }

    public static Car findCar(List<Car> cars, String line) {
        for(Car car: cars){
            if(car.getNumber().equals(line)){
                return car;
            }
        }
        return null;
    }

    public static Owner findOwner(List<Owner> owners, String line) {
        for(Owner owner: owners){
            if(owner.getName().equals(line)){
                return owner;
            }
        }
        return null;
    }
    public static Owner findCarOwner(List<Car> cars, String line){
        for(Car car: cars){
            if(car.getNumber().equals(line)){
               return car.getOwner();
            }
        }
        return null;
    }
}
