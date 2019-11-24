import java.sql.Date;

public class Owner {
    private String name;
    private String surname;
    private int numberOfCars;

    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;

        this.numberOfCars = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }
}
