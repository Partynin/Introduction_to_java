package Chapter_7;

public class GamePickFourCards {

    private static int[] deck = new int[52];
    private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private static String[] ranks = {"Ase", "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King"};
    private static String[] ranksForComSum = {"1", "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "11", "12", "13"};
    private static final int YIELD_SUM = 24;

    /** Main method */
    public static void main(String[] args) {

        // Initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        int count = 0;
        while (sumOfCard(takeFourCards(deck)) != YIELD_SUM)
            count++;

        System.out.println("Enough " + count + " tray.");
    }

    /** Compute the sum of card */
    public static int sumOfCard(int[] arrayOfFourCards) {
        int sum = 0;

        for (int i = 0; i < arrayOfFourCards.length; i++) {
            String rankNumber = ranksForComSum[arrayOfFourCards[i] % 13];
            sum = sum + Integer.parseInt(rankNumber);
        }

        return sum;
    }

    /** Take fore cards */
    public static int[] takeFourCards(int[] deck) {
        int[] fourCards = new int[4];

        for (int i = 0; i < fourCards.length; i++) {
            fourCards[i] = deck[(int)(Math.random() * 52)];
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[fourCards[i] / 13];
            String rank = ranks[fourCards[i] % 13];
            String rankNumber = ranksForComSum[fourCards[i] % 13];
            System.out.println("Card number " + fourCards[i] + ": " +
                    rank + " of " + suit + " figure " + rankNumber);
        }
        System.out.println();

        return fourCards;
    }
}
