package FileHandling;

import java.io.File;

public class deleteFile {
    public static void main(String[] arg) {
        try {
            File file = new File("newFile.txt");
            if (file.delete()) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("File deletion failed!");
            }
        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
