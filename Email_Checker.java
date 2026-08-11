import java.util.Scanner;

public class Email_Checker {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = sc.nextLine();

        if (email.contains("@")
                && email.contains(".")
                && email.indexOf("@") < email.lastIndexOf(".")) {

            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
