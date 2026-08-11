import java.util.Scanner;

public class Firstletteruppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        System.out.println(result.toString().trim());

         for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                System.out.print(Character.toUpperCase(ch));
            }
            else if (str.charAt(i - 1) == ' ') {
                System.out.print(Character.toUpperCase(ch));
            }
            else {
                System.out.print(Character.toLowerCase(ch));
            }
        }
    }
}
