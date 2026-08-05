import java.util.*;

public class mailaddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mail id: ");
        String mail = sc.nextLine();

        if(mail.contains("@") && mail.contains(".com") || mail.contains(".org") || mail.contains(".net") || mail.contains(".in") ){
            System.out.println("Valid email address");
        }

        else{
            System.out.println("Invalid email address");
        }
    }
}
