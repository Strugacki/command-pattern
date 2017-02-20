package invoker;

import interfaces.Order;
import request.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mhallman on 20.02.2017.
 */
public class Broker {
    List<Order> orders = new ArrayList<Order>();

    public void takeOrder(final Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order orderToExecute : orders) {
            orderToExecute.execute();
        }
    }

}
