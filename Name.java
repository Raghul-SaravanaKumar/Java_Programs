import java.util.*;
public class Name {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String sen = sc.next();
        String rev = "";
        for(int i = 0 ; i < sen.length(); i++) {
            char ch = sen.charAt(i);
            rev = ch + rev;
        }

       System.out.println(rev); 

    }
}