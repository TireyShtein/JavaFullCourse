package ReadFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Read a file in Java (4 options)

        // 1. BufferedReader + FileReader = best for reading line-by-line
        // 2. RandomAccessFile = Best for read/write specific portions of large files
        // 3. FileInputStream = Best for binary files (images, videos, audio files)

        String filePath = "C:\\1Programming\\Java\\JavaFullCourse\\src\\ReadFiles\\test.txt";

        ArrayList<String> lines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = reader.readLine()) != null)
                lines.add(line);

            System.out.println(lines);
        }
        catch (IOException e){
            System.out.println("Could not read from file");
        }

    }
}
