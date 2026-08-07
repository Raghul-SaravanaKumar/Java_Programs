import java.util.Scanner;

public class Secondreepating_ch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)
                    && str.indexOf(ch) == i) {

                count++;

                if (count == 1) {
                    System.out.println(ch);
                    return;
                }
            }
        }

        System.out.println("No second repeating character");
    }
}
