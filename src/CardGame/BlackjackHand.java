package CardGame;

public class BlackjackHand {

    private Card[] hand;
    private int currentCard;

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

}
