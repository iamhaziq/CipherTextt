
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = -1;
        String text = null; // Initialize the variable with a default value
        String cipheredText = null;
        StringCipherDecipher cipher = new StringCipherDecipher(text, cipheredText);

        do {
            // Display menu options
            System.out.println("1. Cipher Text");
            System.out.println("2. Decipher Text");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.println("Choose your option: ");

            Scanner input = new Scanner(System.in);
            try {
                option = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }

            if (option == 1) {
                // Cipher text
                System.out.println("Enter your text: ");
                Scanner inputString = new Scanner(System.in);
                text = inputString.nextLine();

                cipher.runCipher(text);

                System.out.println(text != null);
            } else if (option == 2 && text != null) {
                // Decipher text
                cipher.runDecipher();
            } else if (option == 0) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Enter valid Input!!");
            }
        } while (option != 0);
    }
}
