package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observers.IOrderPlacedAlertObserver;

public interface IOrderPlacedObservableInterface {

    public void add(IOrderPlacedAlertObserver iOrderPlacedAlertObserver);

    public void remove(IOrderPlacedAlertObserver iOrderPlacedAlertObserver);

    public void notifyObservers();

    public void onOrderPlaced(String orderID);
}
