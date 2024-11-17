package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observers.IOrderPlacedAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class OrderPlacedImpl implements IOrderPlacedObservableInterface{

    public static OrderPlacedImpl instance = null;
    List<IOrderPlacedAlertObserver> iOrderPlacedAlertObserverList = new ArrayList<>();
    String orderId;

    private OrderPlacedImpl(){

    }

    public static OrderPlacedImpl getInstance() {
        if(instance==null){
            instance = new OrderPlacedImpl();
        }
        return instance;
    }

    @Override
    public void add(IOrderPlacedAlertObserver iOrderPlacedAlertObserver) {
        iOrderPlacedAlertObserverList.add(iOrderPlacedAlertObserver);
    }

    @Override
    public void remove(IOrderPlacedAlertObserver iOrderPlacedAlertObserver) {
        iOrderPlacedAlertObserverList.remove(iOrderPlacedAlertObserver);
    }

    @Override
    public void notifyObservers() {
        for(IOrderPlacedAlertObserver observer : iOrderPlacedAlertObserverList){
            observer.announceOrderPlaced(orderId);
        }
    }

    @Override
    public void onOrderPlaced(String orderId) {
        this.orderId = orderId;
        notifyObservers();
    }
}
