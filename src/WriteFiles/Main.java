package WriteFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Write a file in Java (4 options)

        // 1. FileWriter = small or medium-sized text files
        // 2. BufferedWriter = Better performance for large amount of text
        // 3. PrintWriter = Best for structured data, like reports or logs
        // 4. FileOutputStream = Best for binary files (images, videos, audio files)

        String filePath = "C:\\1Programming\\Java\\JavaFullCourse\\src\\WriteFiles\\test.txt";


        try (Scanner scanner = new Scanner(System.in); FileWriter writer = new FileWriter(filePath)) {
            System.out.print("Enter a sentence to write in file: ");
            String text = scanner.nextLine();
            writer.write(text);
            System.out.println("Written in file!");

        } catch (IOException e) {
            System.out.println("Could not write in file");
        }

    }
}
