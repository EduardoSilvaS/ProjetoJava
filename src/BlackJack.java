import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) throws Exception {
        Scanner input  = new Scanner(System.in); // create a input object

        Deck deck = new Deck(); // create a new deck

        Card[] inicial_jogador = new Card[2]; // create an initial hand for the player
            inicial_jogador[0] = deck.dealCard();
            inicial_jogador[1] = deck.dealCard();
        
        Card[] inicial_dealer = new Card[2]; // create an initial hand for the dealer
            inicial_dealer[0] = deck.dealCard();
            inicial_dealer[1] = deck.dealCard();

        Player jogador = new Player(inicial_jogador, "p"); // creating a new player
        Player dealer = new Player(inicial_dealer, "d"); // creating a new dealer

        // player's turn
        String resposta = "s";

        while (resposta.equals("s") && jogador.getSoma_cartas() < 21) {
            System.out.printf("\n Cartas do Dealer: ");
            dealer.printMao();

            System.out.printf("\n Cartas do Jogador: ");
            jogador.printMao();

            System.out.printf("\n Pontos do Jogador: %d", jogador.getSoma_cartas());

            System.out.printf("\n O Jogador deseja mais cartas? (s/n)");
            resposta = input.nextLine();

            if (resposta.equals("s")) {
                jogador.dealCard(deck.dealCard());
            }
        }

        // check if the exceed limit of 21
        if (jogador.getSoma_cartas() > 21) {
            System.out.printf("\n Cartas do Jogador: ");
            jogador.printMao();

            System.out.printf("\n Pontos do Jogador: %d", jogador.getSoma_cartas());

            System.out.println("\nVoce Perdeu! Passou de 21");
        }
        // check if the player hit a blackjack
        if (jogador.getSoma_cartas() == 21) {
            System.out.printf("\n Cartas do Jogador: ");
            jogador.printMao();

            System.out.printf("\n Pontos do Jogador: %d", jogador.getSoma_cartas()); 

            System.out.println("\nBLACKJACK! Voce venceu o Dealer!");
        }
        // check if the player want to stay
        if (!(resposta.equals("s"))) {
            
        }


    }

}
