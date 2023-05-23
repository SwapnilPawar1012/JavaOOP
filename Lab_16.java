// 13.2) Write Java Program to find the number of words in the given text file.

package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_16 {
    public static void main(String[] arg) {
        try {
            File file = new File("newFile.txt");
            Scanner readFile = new Scanner(file);

            int wordCount = 0;
            while (readFile.hasNext()) {
                String word = readFile.next();
                wordCount++;
            }

            System.out.println("Number of words in the txt file: " + wordCount);
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
