import java.util.Scanner;

public class Password_Strength_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        if (pass.length() < 8) {
            System.out.println("Weak Password");
            return;
        }

        for (int i = 0; i < pass.length(); i++) {

            char ch = pass.charAt(i);

            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isLowerCase(ch))
                lower = true;
            else if (Character.isDigit(ch))
                digit = true;
            else
                special = true;
        }

        if (upper && lower && digit && special)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}
