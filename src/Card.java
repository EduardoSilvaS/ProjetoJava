public class Card {
    private final String face; // face of the card
    private final String naipe; // suit of the card

    // constructor to initialize the card
    Card(String face, String naipe) { 
        this.face = face;
        this.naipe = naipe; 
    }

    // return String representation of the card
    public String toString() 
    { 
        return this.face + " de " + this.naipe;
    } 
}
