import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String [] result = str.split(" ");

        if (result.length > 1) {
            for (String word : result) {
                System.out.println(word);
            }
        } else {
            System.out.println("There is no space in the sentence");
        }
    }
}
