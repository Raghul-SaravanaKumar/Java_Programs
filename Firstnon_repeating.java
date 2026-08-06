import java.util.Scanner;

public class Firstnon_repeating {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println("The first non-repeating character is: " + ch);
            return;
        }
    }
    System.out.println("There is no non-repeating character.");
}
}
