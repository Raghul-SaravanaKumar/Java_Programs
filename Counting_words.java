import java.util.*;
public class Counting_words{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("The words are: " + Arrays.toString(words));
        System.out.println("Number of words: " + wordCount);
    }
}