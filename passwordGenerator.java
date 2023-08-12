import java.util.*;

public class passwordGenerator {
    public static void main(String[] args) {
        // Length of your password as I have choose here to be 8...
        int length = 10;
        System.out.println(new_password(length));
    }

    static char[] new_password(int len) {
        System.out.println("Generating password using random(): ");
        System.out.println("Your new password is: ");

        /*
         * A strong password has cap_chars, Lower_chars, numeric value and symbols.
         * So we are using all of them to generate our password...
         */
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String Symbol = "`~!@#$%^&*(_=+-/.?<>)";

        String values = Capital_chars + Small_chars + Symbol;

        // Using random method...
        Random ra = new Random();
        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(ra.nextInt(values.length()));
        }
        return password;
    }
}
