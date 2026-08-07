import java.util.Scanner;

public class Isogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words to check: ");
        int testCases = sc.nextInt();
        sc.nextLine(); // Clear the buffer

        for (int k = 0; k < testCases; k++) {
            System.out.print("Enter string: ");
            String s = sc.nextLine().toLowerCase();
            boolean isIsogram = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == ' ' || ch == '-') {
                    continue;
                }
                if (s.indexOf(ch) != s.lastIndexOf(ch)) {
                    isIsogram = false;
                    break;
                }
            }

            if (isIsogram) {
                System.out.println("The string is an isogram.");
            } else {
                System.out.println("The string is NOT an isogram.");
            }
        }
        sc.close();
    }
}
