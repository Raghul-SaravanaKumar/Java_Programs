import java.util.Scanner;
public class FirstRepeating_ch {
    public static void main(String [] test){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char ch2 = ch;
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println("The first repeating character is: " + ch);
                return;
            }
            if(str.indexOf(ch) == str.lastIndexOf(ch) ){

            }
        }
        System.out.println("No repeating character found.");
    }
}
