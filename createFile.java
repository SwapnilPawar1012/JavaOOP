package FileHandling;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] arg) {
        try {
            File file = new File("newFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File creation failed!");
            }
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
