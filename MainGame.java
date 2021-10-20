import java.util.Locale;
import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {
        //Declaration of values
        Scanner teclat;
        teclat = new Scanner(System.in);

        // We create the Object player and we give it a inital value
        player jugador = new player();
        jugador.setPosicion(1);

        // As long as the player's position is less than 100, the game will continue
        while (jugador.posicion < 100){
            //We ask if the player want to throw another dice

            System.out.println("Throw a dice? Y / N");
            String response = teclat.nextLine().toUpperCase();


            //If they answer yes
            if (response.equals("Y")){
                //We throw a dice, and add the result to the position of the player
                jugador.rollDice();
                System.out.println("The player position is: " + jugador.getPosicion());

            }
            //If they answer no, we finish the game
            else if (response.equals("N")){
                System.out.println("Your final position is: " + jugador.getPosicion());
                break;
            }
            // If they answer something wrong, it will give a warning
            else {
                System.out.println("Wrong character, please introduce a correct one");
            }

            // If the position of the player equals 100, they win the game
            if (jugador.posicion == 100){
                System.out.println("You win! :D");
                break;
            }
        }
    }
}
