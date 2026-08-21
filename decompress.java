import java.util.Scanner;

public class decompress {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        char che = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                che = ch;
            } else if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                for (int j = 0; j < count; j++) {
                    st.append(che);
                }
            }
        }
        if()
        System.out.println(st);

        sc.close();
    }
}
