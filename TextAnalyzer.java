
//Text analyser
import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your text: ");

        String text = scanner.nextLine();

        // Initialize all individual metric counters
        int characterCount = text.length();
        int wordCount = 0;
        int vowelCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        // --- 1. Simple Word Counting Logic ---
        String trimmedText = text.trim();
        if (!trimmedText.isEmpty()) {
            // Split by simple spaces to grab words
            String[] words = trimmedText.split(" ");
            wordCount = words.length;
        }

        // --- 2. Character-by-Character Breakdown Loop ---
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check for lowercase or uppercase Vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }

            // Check for digits using basic range verification
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }

            // Check for special characters (not letters, not numbers, and not spaces)
            if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') && !(ch >= '0' && ch <= '9') && ch != ' ') {
                specialCount++;
            }
        }

        // --- 3. Display Final Output Summary ---
        System.out.println("\n--- Analysis Results ---");
        System.out.println("Total Characters : " + characterCount);
        System.out.println("Total Words      : " + wordCount);
        System.out.println("Total Vowels     : " + vowelCount);
        System.out.println("Total Digits     : " + digitCount);
        System.out.println("Total Special    : " + specialCount);

        scanner.close();
    }
}