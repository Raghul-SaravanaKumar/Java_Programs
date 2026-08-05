import java.util.Scanner;

public class printingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int a = str.length();
        int b = a / 2;

        if (a % 2 == 0) {
            System.out.println("The middle characters are: " + str.substring(b - 1, b + 1));
        } else {
            System.out.println("The middle character is: " + str.charAt(b));
        }
    }
}
