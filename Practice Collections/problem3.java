import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        int Max = Collections.max(list);

        System.out.println(max);
        System.out.println(Max);
    }
}
