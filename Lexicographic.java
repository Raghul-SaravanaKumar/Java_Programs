import java.util.Arrays;
import java.util.Scanner;

public class Lexicographic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sen = sc.nextLine();

        String[] a = sen.split(" ");
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[0]);
            break;
        }
    }
}
