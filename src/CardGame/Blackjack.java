package CardGame;

public class Blackjack {
    public static void main(String[] args) {
        // Create a final int so that the maximum amount of cards cannot be changed
        final int MAX_CARDS = 11;
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

        while (true) {

            String playerChoice = Tools.MyTools.readString("Do you want to hit or stay (answer with hit or stay): ");

            if (playerChoice.equals("stay")) {
                break;
            }
            if (playerChoice.equals("hit")) {
                player.addCard(myDeckOfCards.dealCard());
                System.out.println("New hand after card added: ");
                System.out.println(player);
            }
            System.out.println("Your total is: " + player.getHandValue());
        }

        // dealer

        while (dealer.getHandValue() < 17) {

        }
    }
}
