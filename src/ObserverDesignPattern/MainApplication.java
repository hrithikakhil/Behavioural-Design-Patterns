package ObserverDesignPattern;

import ObserverDesignPattern.Observable.OrderPlacedImpl;
import ObserverDesignPattern.Observers.EmailService;
import ObserverDesignPattern.Observers.GenerateTaxInvoice;
import ObserverDesignPattern.Observers.InventoryService;

public class MainApplication {
    public static void main(String[] args) {

        OrderPlacedImpl orderPlaced = OrderPlacedImpl.getInstance();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        GenerateTaxInvoice taxInvoice = new GenerateTaxInvoice();

        //Get Order Id from orderService layer
        String orderId = "404-2895796548-0659517"; // String orderID = orderService.getOrderId();

        orderPlaced.onOrderPlaced(orderId);

    }
}
