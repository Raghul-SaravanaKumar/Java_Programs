import java.util.Scanner;

public class Most_Frequently_Occurring_Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String words[] = str.split(" ");

        int max = 0;
        String ans = "";

        for (int i = 0; i < words.length; i++) {

            int count = 0;

            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ans = words[i];
            }
        }

        System.out.println(ans);
    }
}
