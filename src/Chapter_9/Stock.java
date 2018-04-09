package Chapter_9;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangPercent() {
        double percent = 100 - (previousClosingPrice * 100 / currentPrice);

        return percent;
    }

    public double getPreviousClousengPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double newPrice) {
        previousClosingPrice = newPrice;
    }


    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

}
