package ObserverDesignPattern.Observers;

import ObserverDesignPattern.Observable.OrderPlacedImpl;

public class EmailService implements IOrderPlacedAlertObserver {

    public EmailService() {
        OrderPlacedImpl orderPlaced = OrderPlacedImpl.getInstance();
        orderPlaced.add(this);
    }

    @Override
    public void announceOrderPlaced(String orderId) {
        System.out.println("Sending OrderId to Email Service");
    }
}
