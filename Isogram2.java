import java.util.Scanner;

public class Isogram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is an isogram: ");
        String S = sc.next().toLowerCase();
        S = S.replace(" ", "").replace("-", "");
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (S.indexOf(ch) != S.lastIndexOf(ch)) {
                System.out.print("Not Isogram");
                return;
            }
        }
        System.out.print("Isogram");
    }
}
