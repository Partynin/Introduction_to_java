package Chapter_9;

public class TestStock {
    /** Main method */
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("Price chang " + stock.getChangPercent() + " %");
    }
}
