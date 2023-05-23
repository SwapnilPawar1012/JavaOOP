package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] arg) {
        try {
            File file = new File("newFile.txt");
            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()) {
                String data = readFile.nextLine();
                System.out.println(data);
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
