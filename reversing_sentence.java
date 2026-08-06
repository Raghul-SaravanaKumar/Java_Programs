import java.util.Arrays;
import java.util.Scanner;

public class reversing_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String sen = sc.nextLine();
        String[] a = sen.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}