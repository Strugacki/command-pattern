package implementations;

import interfaces.Order;
import request.Car;

/**
 * Created by mhallman on 20.02.2017.
 */
public class SellCar implements Order {

    private Car carToSell;

    public SellCar(Car car) {
        this.carToSell = car;
    }

    public void execute() {
        carToSell.sell();
    }
}
