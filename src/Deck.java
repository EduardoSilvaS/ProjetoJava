import java.security.SecureRandom;


public class Deck {
    private Card[] deck; // array of cards
    private static final int DECK_SIZE = 52; // constant for the size of the deck

    private static final SecureRandom rand = new SecureRandom(); // needed instatiates the class in order to use nextInt(); method


    Deck() {
        // build the deck
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valette", "Dama", "Rei", "Ás"};
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};

        this.deck = new Card[DECK_SIZE];
        int cont = 0;

        for (int i = 0; i < naipes.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                this.deck[cont] = new Card(faces[j], naipes[i]);
                cont++;
            }
        }
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
}
