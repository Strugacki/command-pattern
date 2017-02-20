package request;

/**
 * Created by mhallman on 20.02.2017.
 */
public class Car {

    private String model = "";
    private int yearOfProduction;

    public Car(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public void buy() {
        System.out.println( new StringBuilder().append("Buying: ").append(this.model).append(", from :").append(this.yearOfProduction).toString());
    }

    public void sell() {
        System.out.println(new StringBuilder().append("Selling: ").append(this.model).append(", from :").append(this.yearOfProduction).toString());
    }
}
