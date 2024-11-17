package ObserverDesignPattern.Observers;

import ObserverDesignPattern.Observable.OrderPlacedImpl;

public class InventoryService implements IOrderPlacedAlertObserver {

    public InventoryService() {
        OrderPlacedImpl orderPlaced = OrderPlacedImpl.getInstance();
        orderPlaced.add(this);
    }

    @Override
    public void announceOrderPlaced(String orderId) {
        System.out.println("Sending OrderId to Inventory Service");
    }
}
