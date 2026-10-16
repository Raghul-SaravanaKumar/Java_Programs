package Logics;
import java.util.*;

public class Moving_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
        int arr[] = new int[r];
        int arr1[] = new int[r];
        for(int i = 0;i < r;i++) {
            arr[i] = sc.nextInt();
        }

        int nonZeroPos = 0;

             for (int i = 0; i < r; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPos] = arr[i];
                nonZeroPos++;
            }
        }

        while (nonZeroPos < r) {
            arr[nonZeroPos] = 0;
            nonZeroPos++;
        }

        System.out.println(Arrays.toString(arr));

        sc.close();

    }
}
