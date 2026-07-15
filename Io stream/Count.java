import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = scanner.nextLine().trim();
        System.out.println("Enter the character to be counted");
        String inputCharStr = scanner.nextLine().trim();
        if (inputCharStr.isEmpty()) {
            System.out.println("Error: No character entered.");
            return;
        }
        char targetChar = Character.toLowerCase(inputCharStr.charAt(0));
        int count = 0;
        File file = new File(fileName);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                int nextChar;
                while ((nextChar = reader.read()) != -1) {
                    if (Character.toLowerCase((char) nextChar) == targetChar) {
                        count++;
                    }
                }
                System.out.printf("File '%s' has %d instances of letter '%s'.\n", fileName, count, inputCharStr.charAt(0));
                
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.printf("Error: The file '%s' does not exist.\n", fileName);
        }
        scanner.close();
    }
}