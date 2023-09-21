public class Deck {
    private Card[] deck; // array of cards
    private static final int DECK_SIZE = 52; // constant for the size of the deck


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
    }
}
