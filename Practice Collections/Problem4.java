import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int min = list.get(0);
        for (int Smallest : list) {
            if (Smallest < min) {
                min = Smallest;
            }
        }
        int min2 = Collections.min(list);
        System.out.println("The smallest element is: " + min);
        System.out.println("The smallest element is: " + min2);

    }
}
