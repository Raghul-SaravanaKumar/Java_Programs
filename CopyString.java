import java.util.Scanner;

public class CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str1 = sc.nextLine();
        String str2 = str1;

        System.out.println("Original String : " + str1);
        System.out.println("Copied String   : " + str2);
    }
}
