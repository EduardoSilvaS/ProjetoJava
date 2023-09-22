public class BlackJack {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck(); // create a new deck
        Card[] inicial = new Card[2]; // initial hand
            inicial[0] = deck.dealCard();
            inicial[1] = deck.dealCard();

        Player jogador = new Player(inicial); // creating a new player;

        System.out.println(jogador.getSoma_cartas()); 
        deck.printDeck();
    }
}
