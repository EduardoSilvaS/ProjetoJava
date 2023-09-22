import java.security.SecureRandom;


public class Deck {
    private static final SecureRandom rand = new SecureRandom(); // needed instatiates the class in order to use nextInt(); method

    private Card[] deck; // array of cards
    private int top_card; // top card
    private static final int DECK_SIZE = 52; // constant for the size of the deck

    Deck() {
        // build the deck
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valette", "Dama", "Rei", "As"};
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};

        this.deck = new Card[DECK_SIZE];
        int cont = 0;

            // populate the deck
        for (int i = 0; i < naipes.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                this.deck[cont] = new Card(faces[j], naipes[i]);
                cont++;
            }
        }

        // set the top card to be 0
        this.top_card = 0;

        // shuffle deck
        shuffleDeck();
    }   

    // shuffle deck method
    public void shuffleDeck() {
        int j = 0;
        for (int i = 0; i < DECK_SIZE; i++) {
            j = rand.nextInt(DECK_SIZE);

            Card temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
    }

    // method to print deck
    public void printDeck() {
        for (int i = 0; i < DECK_SIZE; i++) {
            System.out.println(this.deck[i].toString());
        }
    }

    // method to deal a card
    public Card dealCard() {
        if (this.top_card < this.deck.length) 
            return this.deck[this.top_card++]; // return the deck's top card
        else        
            return null; // return null to indicate that all Cards were dealt
    }

}
