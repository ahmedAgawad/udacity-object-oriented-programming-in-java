import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // extract movies names from file into scanner object
        // add each line from file to array of strings
        // pick random name from array
        // loop for 10 times displaying name in ---------
        // if user guessed right remove - from hidden and make it correct
        // if user guessed wrong add the wrong guess to string then display all chars from this string

        File file = new File("movies");
        Scanner firstScanner = new Scanner(file);

        int  noOfMovies = 0;

        while(firstScanner.hasNextLine()) {
            noOfMovies++;
            firstScanner.nextLine();
        }

        String [] movieList = new String[noOfMovies];

        Scanner secScanner = new Scanner(file);
        int index = 0;
        while(secScanner.hasNextLine()) {
            movieList[index] = secScanner.nextLine();
            index++;
        }



        Random rand = new Random();
        String randomMovie = movieList[rand.nextInt(movieList.length)];


        StringBuilder randomHidden = new StringBuilder();
        randomHidden.append("_".repeat(randomMovie.length()));
        for (int i = 0; i < randomHidden.length(); i++) {
            if(randomMovie.charAt(i) == ' ') {
                randomHidden.setCharAt(i, ' ');
            }
        }


        Scanner input = new Scanner(System.in);
        StringBuilder wrongLetters = new StringBuilder();


        int wrongCount = 0;
        while (wrongCount < 11) {
            System.out.println("You are guessing:" + randomHidden);
            System.out.print("You have guessed (" + wrongCount + ") wrong letters :");

            for (int i = 0; i < wrongLetters.length(); i++) {
                System.out.print(wrongLetters.charAt(i) + " ");
            }

            System.out.println("Guess a letter:");
            char guessedCh = input.next().charAt(0);

            boolean foundInName = false;

            for (int i = 0 ;i < randomHidden.length(); i++) {
                if(guessedCh == randomMovie.charAt(i)) {
                    randomHidden.setCharAt(i, randomMovie.charAt(i));
                    foundInName = true;
                }

            }


            if(!foundInName) {
                wrongCount++;
                if (wrongLetters.indexOf(String.valueOf(guessedCh)) == -1) {
                    wrongLetters.append(guessedCh);
                }

            }

            if(randomHidden.indexOf("_") == -1) {
                System.out.println("You win!");
                System.out.println("You have guessed '" + randomMovie + "' correctly." );
                break;
            }
        }

        if(wrongCount >= 10) {
            System.out.println("Lost 10 points try again");
        }
    }

}