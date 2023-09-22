import java.util.Arrays;
import java.util.stream.IntStream;

public class Card {
    private final String face; // face of the card
    private final String naipe; // suit of the card
    public    int valor_carta; // value of the card

    // constructor to initialize the card
    Card(String face, String naipe) { 
        this.face = face;
        this.naipe = naipe;
        this.valor_carta = checkValue(); 
    }

    // return String representation of the card
    public String toString() 
    { 
        return this.face + " de " + this.naipe;
    } 
    
    // return the value of the card
    private int checkValue(){
        String[] faces_numero = {"2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] faces_figuras = {"Valette", "Dama", "Rei"};

        int valor = 0;

        if (check(faces_numero, this.face)) {valor = Integer.parseInt(this.face);} // check if it is a number
        if (check(faces_figuras, this.face)){valor = 10;}                          // check if it is a figure
        if (this.face == "As")              {valor = 11;}                          // check if it is an Ace

        return valor;
    }

    private static boolean check(String[] arr, String toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (String element : arr) {
            if (element == toCheckValue) {
                test = true;
            }
        }
        return test;
    }
}
