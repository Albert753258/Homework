package lesson2410;

import java.sql.Date;

public class Car {
    private String number;
    private String markaaa;
    private Date production;
    private Owner owner;

    public Car(String number, String markaaa, Date production) {
        this.number = number;
        this.markaaa = markaaa;
        this.production = production;
        this.owner = null;
    }

    public Car(String number, String markaaa, Date production, Owner owner) {
        this.number = number;
        this.markaaa = markaaa;
        this.production = production;
        this.owner = owner;
    }

    public Car(String number) {
        this(number,"Default mark", new Date(System.currentTimeMillis()));
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

    public Date getProduction() {
        return production;
    }

    public void setProduction(Date production) {
        this.production = production;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
