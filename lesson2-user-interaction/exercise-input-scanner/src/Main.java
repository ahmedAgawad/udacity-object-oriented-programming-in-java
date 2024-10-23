import java.util.*;

public class Main {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100) + 1;
        boolean hasWon = false ;

        Scanner input = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess left ");
            System.out.print("Guess the number");

            int guessed  = input.nextInt();

            if (guessed > randomNum ) {
                System.out.println("guessed number was higher than random");
            } else if(guessed < randomNum) {
                System.out.println("guessed number was lower than random");
            } else {
                hasWon = true;
                break;
            }
        }

        if(hasWon) {
            System.out.println("You guessed it right");
        } else {
            System.out.println("You ran out of guesses");
        }
    }
}