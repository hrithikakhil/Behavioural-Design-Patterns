package StrategyDesignPattern;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategyInstance(String mode){
        if(mode.equalsIgnoreCase("bike")){
            return new BikePathCalculator();
        } else if (mode.equalsIgnoreCase("car")) {
            return new CarPathCalculator();
        }else {
            return new WalkPathCalculator();
        }
    }
}
