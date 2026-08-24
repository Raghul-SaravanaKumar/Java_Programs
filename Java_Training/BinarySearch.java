import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the array: ");
        int range = sc.nextInt();
        int[] arr = new int[range];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < range; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        boolean isFound = false;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                isFound = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Simpler fallback check
        if (!isFound) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
