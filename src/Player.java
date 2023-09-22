public class Player {
    private Card[] mao; // array of cards
    private int soma_cartas; // array containing the value of the hand

    Player(Card[] cards) {
        this.mao = new Card[2]; // the players start the game with 2 cards
        this.mao[0] = cards[0];
        this.mao[1] = cards[1];

        sumOfCards();
    }

    private void sumOfCards() {
        this.soma_cartas = 0;
        for (int i = 0; i < this.mao.length; i++) {
            this.soma_cartas += this.mao[i].getValor_carta();
        }
    }

    public int getSoma_cartas() {
        return this.soma_cartas;
    }    
}
