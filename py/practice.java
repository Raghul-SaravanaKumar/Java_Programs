import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != (' ')) {
                result = result + ch;
            }

        }
        if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println("There is no space in the sentence");
        }
    }
}