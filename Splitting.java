import java.util.Scanner;

public class Splitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                result += "*";
            }
        }
        System.out.println(result);
    }
}