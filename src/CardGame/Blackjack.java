package CardGame;

public class Blackjack {
    public static void main(String[] args) {
        // Create a final int so that the maximum amount of cards cannot be changed
        final int maxDeck = 10;
        // Create the dealer's hand
        Card[] dealerHand = new Card[10];
        Card[] player = new Card[10];

        DeckOfCards deck = new DeckOfCards(); // 52 cards
        deck.shuffle();

    }
}
