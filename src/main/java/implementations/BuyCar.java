package implementations;

import interfaces.Order;
import request.Car;

/**
 * Created by mhallman on 20.02.2017.
 */
public class BuyCar implements Order {

    private Car carToBuy;

    public BuyCar(Car car) {
        this.carToBuy = car;
    }

    public void execute() {
        carToBuy.buy();
    }
}
