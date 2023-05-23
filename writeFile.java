package FileHandling;

// import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeFile {
    public static void main(String[] arg) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter("newFile.txt", true);
            System.out.println("Write something: ");
            String inputString = sc.nextLine();
            fileWriter.write("\n" + inputString);

            // FileWriter fileWriter = new FileWriter("newFile.txt");
            // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // System.out.println("Write something: ");
            // String inputString = sc.nextLine();
            // bufferedWriter.write(inputString);
            // bufferedWriter.newLine();
            // bufferedWriter.close();

            fileWriter.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
