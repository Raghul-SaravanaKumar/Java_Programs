import java.util.*;
public class removespace {
    public static void main(String[] test) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter the Statement: ");
       String str = sc.nextLine();

       String result = str.replace(" ","");
       System.out.println(result);
    }
}
