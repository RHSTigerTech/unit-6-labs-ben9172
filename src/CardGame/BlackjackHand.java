package CardGame;

public class BlackjackHand {

    private Card[] hand;
    private int currentCard;
    final int LOSE = 21;

    public BlackjackHand() {
        int currentCard = 0;
        hand = new Card[11];
    }

    public void addCard(Card c) {
        hand[currentCard] = c;
        currentCard += 1;
    }

    public Card showCard(int n) {
        // make statement to check for valid n index
        return hand[n];
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < currentCard; i += 1) {
            s += hand[i] + "\n";
        }
        return s;
    }

    public int getHandValue() {
        int value = 0;
        for (int i = 0; i < currentCard; i += 1) {
            if (hand[i].getFace().equalsIgnoreCase("two")) {
                value += 2;
            } else if (hand[i].getFace().equalsIgnoreCase("three")) {
                value += 3;
            } else if (hand[i].getFace().equalsIgnoreCase("four")) {
                value += 4;
            } else if (hand[i].getFace().equalsIgnoreCase("five")) {
                value += 5;
            } else if (hand[i].getFace().equalsIgnoreCase("six")) {
                value += 6;
            } else if (hand[i].getFace().equalsIgnoreCase("seven")) {
                value += 7;
            } else if (hand[i].getFace().equalsIgnoreCase("eight")) {
                value += 8;
            } else if (hand[i].getFace().equalsIgnoreCase("nine")) {
                value += 9;
            } else if (hand[i].getFace().equalsIgnoreCase("jack")) {
                value += 10;
            } else if (hand[i].getFace().equalsIgnoreCase("queen")) {
                value += 10;
            } else if (hand[i].getFace().equalsIgnoreCase("king")) {
                value += 10;
                // If Ace is less than 21, it becomes an 11
            } else if ((hand[i].getFace().equalsIgnoreCase("ace") && value < LOSE)) {
                value += 11;
                if (value >= 21) {
                    value -= 10;
                    return value;
                }
                // If Ace is less more 21, it becomes a 1 (probably wont work because you
                // already lost)
            } else if ((hand[i].getFace().equalsIgnoreCase("ace") && value > LOSE)) {
                value += 1;
            }
            return value;
        }

    }

}
