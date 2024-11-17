package ObserverDesignPattern.Observers;

public interface IOrderPlacedAlertObserver {
    public void announceOrderPlaced(String orderId);
}
