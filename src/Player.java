public class Player {
    private Card[] mao; // array of cards
    private int soma_cartas; // array containing the value of the hand

    Player(Card[] cards) {
        this.mao = new Card[2]; // the players start the game with 2 cards
        this.mao[0] = cards[0];
        this.mao[1] = cards[1];
    }
}
