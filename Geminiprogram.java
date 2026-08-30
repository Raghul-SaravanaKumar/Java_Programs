import java.util.Scanner;

public class Geminiprogram {
    public static void main(String[] args) {
        StringBuilder result1 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String value = sc.next();
        String result2 = "";
        String result3 = "";
        char letter = ' ';
        int count = 0;

        // Decompress the String.
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isLetter(ch)) {
                letter = ch;
            } else if (Character.isDigit(ch)) {
                count = Character.getNumericValue(ch);

                for (int j = 0; j < count; j++) {
                    result1.append(letter);
                }
            }
        }

        // Toggle the cases of the String.
        for (int i = 0; i < result1.length(); i++) {
            char ch = result1.charAt(i);
            if (Character.isUpperCase(ch)) {
                result2 = result2 + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result2 = result2 + Character.toUpperCase(ch);
            }
        }

        // Reverse the String.
        for (int i = result2.length() - 1; i >= 0; i--) {
            char ch = result2.charAt(i);
            result3 = result3 + ch;
        }
        System.out.println();
        System.out.println("Decompressed String: " + result1);
        System.out.println("Toggled Case String: " + result2);
        System.out.println("Reversed String: " + result3);
    }
}
