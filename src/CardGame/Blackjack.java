package CardGame;

public class Blackjack {
    public static void main(String[] args) {
        // Create a final int so that the maximum amount of cards cannot be changed
        // final int maxDeck = 10;
        // // Create the dealer's hand
        // Card[] dealerHand = new Card[10];
        // Card[] player = new Card[10];

        // DeckOfCards deck = new DeckOfCards(); // 52 cards
        // deck.shuffle();

        // Create a final int so that the maximum amount of cards cannot be changed
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // put Card objects in random order

        BlackjackHand player = new BlackjackHand();
        BlackjackHand dealer = new BlackjackHand();

        player.addCard(myDeckOfCards.dealCard());
        dealer.addCard(myDeckOfCards.dealCard());
        player.addCard(myDeckOfCards.dealCard());
        dealer.addCard(myDeckOfCards.dealCard());

        System.out.println("Dealer has: ");
        System.out.println(dealer.showCard(0));
        System.out.println("XXXX + XXXXX");

        System.out.println();
        System.out.println();

        System.out.println("You have: ");
        System.out.println(player);

        for (int i = 0; i < 2; i += 1) {

            String playerChoice = Tools.MyTools.readString("Do you want to hit or stay (answer with hit or stay): ");

            if (playerChoice.equals("stay")) {
                break;
            }
            if (playerChoice.equals(("hit"))) {
                String tempCard;
                tempCard += player.addCard(myDeckOfCards.dealCard());
                System.out.println("new hand after card added: " + tempCard);
            }
        }

    }
}
