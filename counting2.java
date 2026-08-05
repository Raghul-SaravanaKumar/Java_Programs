import java.util.Scanner;

public class counting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int count1 = 0; // Alphabetic characters
        int count2 = 0; // Digits
        int count3 = 0; // Special characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (ch >= 'a' && ch <= 'z') {
                    count1++;
                } else if (ch >= '0' && ch <= '9') {
                    count2++;
                } else {
                    count3++;
                }
            }

        }
        System.out.println("Number of alphabetic characters: " + count1);
        System.out.println("Number of digits: " + count2);
        System.out.println("Number of special characters: " + count3);
    }
}
