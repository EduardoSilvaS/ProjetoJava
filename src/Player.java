public class Player {
    private Card[] mao; // array of cards
    private int soma_cartas; // array containing the value of the hand
    private int n_cartas = 2; // variable containing the amount of cards in the player's hand

    Player(Card[] cards, String type) {
        this.mao = new Card[20]; // 20 represents the maximum amount of cards a player can have
        if (type.equals("p")) { // check if it's the dealer or the player
            this.mao[0] = cards[0]; // the player start the game with 2 cards
            this.mao[1] = cards[1];
        }
        if (type.equals("d")) {
            cards[0].setHidden();   // the first card of dealer is hidden
            this.mao[0] = cards[0]; // the dealer also start the game with 2 cards
            this.mao[1] = cards[1];
        }

        sumOfCards();
    }

    // this method sums the cards and inserts into a variable
    private void sumOfCards() {
        this.soma_cartas = 0;
        for (int i = 0; i < this.n_cartas; i++) {
            this.soma_cartas += this.mao[i].getValor_carta();
        }
    }

    // method that enables the player to deal a card
    public void dealCard(Card card) {
        this.n_cartas++;
        this.mao[this.n_cartas - 1] = card;

        sumOfCards();
    }

    // returns the sum of the cards
    public int getSoma_cartas() {
        return this.soma_cartas;
    }  
    
    public void printMao() {
        for (int i = 0; i < this.n_cartas; i++) {
            System.out.printf("[" + this.mao[i].toString() + "]");
        }
    }
}
