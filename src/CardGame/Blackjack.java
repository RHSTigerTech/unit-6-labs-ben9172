package CardGame;

public class Blackjack {
    public static void main(String[] args) {
        // Create a final int so that the maximum amount of cards cannot be changed
        final int MAX_CARDS = 11;
        int PLAYER_LOSS = 0;
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
                if (player.getHandValue() >= 21) {
                    System.out.println("\\   /    ___             |       ___           ");
                    System.out.println(" \\ /    |   |  |  |      |      |   |          ");
                    System.out.println("  |     |   |  |  |      |      |   |           ");
                    System.out.println("  |      ___   |__|      |___    ___            ");
                    PLAYER_LOSS += 1;
                    break;
                }
            }
            System.out.println("Your total is: " + player.getHandValue());
        }

        // dealer

        while ((dealer.getHandValue() < 17) && (PLAYER_LOSS == 0)) {
            // If the dealer has a total of cards that are less than 17, he keeps hitting
            // until he reaches a value of 17 or more
            System.out.println("Dealer's hand: " + dealer);
            System.out.println("The dealer hits... ");
            dealer.addCard(myDeckOfCards.dealCard());
            // dealer.getHandValue();

            // int dealerChoice;

            // Randomize the dealer's choice between 0-1
            // dealerChoice = (int)(Math.random());

            // if (dealerChoice < 0.5){
            // // Dealer hits.
            // System.out.println("The dealer hits... ");
            // dealer.addCard(myDeckOfCards.dealCard());
            // }
            // else {
            // // Dealer stays.
            // System.out.println("The dealer stays... ");
            // break;
            // }

        }

        if (dealer.getHandValue() > 17) {
            System.out.println("The dealer stops hitting... ");
            System.out.println("Dealer's hand: " + dealer);
        }

        System.out.println(player);
        System.out.println(player.getHandValue());
        System.out.println(dealer);
        System.out.println(dealer.getHandValue());
    }
}
