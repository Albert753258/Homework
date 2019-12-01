import java.sql.Date;

public class Car {
    private String number;
    private String markaaa;
    private long numberOfOwner;

    public Car(String number, String markaaa) {
        this.number = number;
        this.markaaa = markaaa;
    }

    public Car(String number, long numberOfOwner) {
        this.number = number;
        this.numberOfOwner = numberOfOwner;
    }

    public Car(String number) {
        this(number,"Default mark");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMarkaaa() {
        return markaaa;
    }

    public void setMarkaaa(String markaaa) {
        this.markaaa = markaaa;
    }

    public long getNumberOfOwner() {
        return numberOfOwner;
    }

    public void setNumberOfOwner(long numberOfOwner) {
        this.numberOfOwner = numberOfOwner;
    }
}
