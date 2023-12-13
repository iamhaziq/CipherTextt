package CipherText;

/**
 * This class provides methods for ciphering and deciphering a string.
 */
public class StringCipherDecipher {

    private String text;
    private String cipheredText;

    /**
     * Constructs a StringCipherDecipher object with the given text and cipheredText.
     */
    public StringCipherDecipher(String text, String cipheredText) {
        this.text = text;
        this.cipheredText = cipheredText;
    }

  
    // Checks if the given text is valid.

    private boolean validText(String text) {
        this.text = text;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 32)) {

            } else {
                return false;
            }
        }
        return true;
    }

    
    // Ciphers the given text.
     
    private String cipher(String text) {
        this.text = text;
        StringBuilder cipher = new StringBuilder(text);
        int length = text.length();
        int ch;
        for (int i = 0; i < length; i++) {
            ch = cipher.charAt(i);
            if (ch == 122) {
                ch = 97;
            } else if (ch == 90) {
                ch = 65;
            } else if (ch == 32) {

            } else {
                ch += 1;
            }
            cipher.setCharAt(i, (char) ch);
        }
        return cipher.toString();
    }

    
    // Runs the ciphering process on the given text.
    
    public void runCipher(String text) {
        this.text = text;
        System.out.println("Ciphered Text");
        if (validText(text)) {
            this.cipheredText = cipher(text);
            System.out.println(this.cipheredText);
        } else {
            System.out.println("Invalid Text!!");
        }
    }

    
    // Runs the deciphering process on the ciphered text.
     
    public void runDecipher() {
        System.out.println("Ciphered Text");
        System.out.println(this.cipheredText);
        System.out.println();
        System.out.println("Deciphered Text");
        System.out.println(this.text);
    }

    
    // Prints an empty ciphered text message.
    
    public void emptyCipher() {
        System.out.println("Ciphered Text");
        System.out.println("No Ciphered Text Found!\r");
        System.out.println();
        System.out.println("Deciphered Text");
        System.out.println("Invalid!");
    }
}