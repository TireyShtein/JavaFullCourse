import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String filePath = "src\\words.txt";
        ArrayList<String> words = new ArrayList<>();
        String word;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = bufferedReader.readLine()) != null)
                words.add(line);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Random random = new Random();
        int index = random.nextInt(words.size());
        word = words.get(index);


        for (int i = 0; i < word.length(); i++) {
            wordState.add('_'); // fill array with the size of the word with underscores instead
        }

        System.out.println("************************");
        System.out.println("Welcome to Hangman Game!");
        System.out.println("************************");

        while (wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for (char c : wordState)
                System.out.print(c + " ");

            System.out.print("\nGuess a letter: ");
            char letter = scanner.next().toLowerCase().charAt(0);


            // Check for matching letter by counting amount
            // of occurrences of guessing letter
            // >= means that there is a guessing letter
            // in the word
            if (word.indexOf(letter) >= 0){
                System.out.println("Correct guess!\n");

                for (int i = 0; i < word.length(); i++)
                    if (word.charAt(i) == letter)
                        wordState.set(i, letter);

                if (!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word is: " + word);
                    break;
                }
            }
            else {
                System.out.println("Wrong guess!\n");
                wrongGuesses++;
            }
        }

        if (wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }
        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses){

        return switch (wrongGuesses){
            case 0 ->
                    """
                    
                    
                    
                    """;
            case 1 ->
                    """
                        o
                    
                    
                    """;
            case 2 ->
                    """
                        o
                      /
                    
                    """;

            case 3 ->
                    """
                        o
                      /   \\ 
                        
                    """;

            case 4 ->
                    """
                        o
                      / | \\ 
                        
                    """;

            case 5 ->
                    """
                        o
                      / | \\ 
                       / 
                    """;

            case 6 ->
                    """
                        o
                      / | \\ 
                       / \\
                    """;

            default -> "";
        };

    }
}
