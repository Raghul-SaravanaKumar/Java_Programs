import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sen = sc.nextLine();

        String[] words = sen.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder revWord = new StringBuilder(words[i]);
            result.append(revWord.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Reversed words: " + result.toString());
        sc.close();
    }
}
