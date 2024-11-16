package StrategyDesignPattern;

public class GoogleMap {

    public void findPath(String from, String to, String mode){

        PathCalculatorStrategy pathCalculatorStrategy =
                    PathCalculatorFactory.getPathCalculatorStrategyInstance(mode);

        pathCalculatorStrategy.findPath(from,to,mode);
    }
}
