package ObserverDesignPattern.Observers;

import ObserverDesignPattern.Observable.OrderPlacedImpl;

public class GenerateTaxInvoice implements IOrderPlacedAlertObserver {

    public GenerateTaxInvoice() {
        OrderPlacedImpl orderPlaced = OrderPlacedImpl.getInstance();
        orderPlaced.add(this);
    }

    @Override
    public void announceOrderPlaced(String orderId) {
        System.out.println("Sending OrderId to TaxGenerator Service");
    }
}
