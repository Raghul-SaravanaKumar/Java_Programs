import java.util.ArrayList;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int sum = 0;
        for (int num : list) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
