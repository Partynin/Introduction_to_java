package Chapter_7;

public class SimulationCouponCollectorsProblem {

    private static int[] deck = new int[52];
    private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
    private static int numberOfPicks;
    private static int[] pickedCards = {100, 100, 100, 100};

    /** Main method */
    public static void main(String[] args) {
        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
             deck[i] = i;

        // Shuffle the cards
         for (int i = 0; i < deck.length; i++) {
             // Generate an index randomly
             int index = (int)(Math.random() * deck.length);
             int temp = deck[i];
             deck[i] = deck[index];
             deck[index] = temp;
             }

        picker(deck);
        displayRes(pickedCards, numberOfPicks);

    }

    /** Picks four cards from each suit */
    public static void picker(int[] deck) {

        numberOfPicks = 0;
        int count = 0;

        while (count < 4) {
            numberOfPicks++;
            int pick = 1 + ((int) (Math.random() * 51));
            System.out.println(pick);
            String suit = suits[deck[pick] / 13];
            if (isNewSuit(suit, pickedCards)) {
                pickedCards[count] = deck[pick];
                count++;
            }
        }
    }

    /** Check suit */
    public static boolean isNewSuit(String suit, int[] pickedCards) {
        boolean flag = true;

        for (int i = 0; i < pickedCards.length; i++) {
            if (pickedCards[i] == 100)
                continue;
            String suitInPicked = suits[pickedCards[i] / 13];
            if (suit.equals(suitInPicked)) {
                flag = false;
                break;
            }
            else flag = true;
        }

        return flag;
    }

    /** Display result */
    public static void displayRes(int[] pickedCards, int numberOfPicks) {
        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[pickedCards[i] / 13];
            String rank = ranks[pickedCards[i] % 13];
            System.out.println("Card is " + rank + " of " + suit);
        }

        System.out.println("Number of picks: " + numberOfPicks);
    }
}
