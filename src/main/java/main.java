import implementations.BuyCar;
import implementations.SellCar;
import invoker.Broker;
import request.Car;

/**
 * Created by mhallman on 20.02.2017.
 */
public class main {

    public static void main(String[] args) {
        Car example = new Car("Passeratti", 1990);

        BuyCar buyCarOrder = new BuyCar(example);
        SellCar sellCarOrder = new SellCar(example);

        Broker broker = new Broker();
        broker.takeOrder(buyCarOrder);
        broker.takeOrder(sellCarOrder);

        broker.placeOrders();
    }

}
