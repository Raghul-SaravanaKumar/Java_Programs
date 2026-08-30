import java.util.Scanner;

public class Geminiprogram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String value = sc.next();

        StringBuilder result1 = new StringBuilder();

        // 1. Decompress (Handling multi-digit numbers like A12 correctly)
        int i = 0;
        while (i < value.length()) {
            char letter = value.charAt(i);
            i++;

            int count = 0;
            // Parse multi-digit numbers
            while (i < value.length() && Character.isDigit(value.charAt(i))) {
                count = count * 10 + Character.getNumericValue(value.charAt(i));
                i++;
            }

            for (int j = 0; j < count; j++) {
                result1.append(letter);
            }
        }

        // 2. Toggle Case using StringBuilder
        StringBuilder result2 = new StringBuilder();
        for (int k = 0; k < result1.length(); k++) {
            char ch = result1.charAt(k);
            if (Character.isUpperCase(ch)) {
                result2.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result2.append(Character.toUpperCase(ch));
            } else {
                result2.append(ch);
            }
        }

        // 3. Manual Reverse using StringBuilder (Adhering to the constraint)
        StringBuilder result3 = new StringBuilder();
        for (int k = result2.length() - 1; k >= 0; k--) {
            result3.append(result2.charAt(k));
        }

        System.out.println("\nDecompressed String: " + result1);
        System.out.println("Toggled Case String: " + result2);
        System.out.println("Reversed String: " + result3);
    }
}