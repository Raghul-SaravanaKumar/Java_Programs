import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int range = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[range];
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                isFound = true; // Set flag to true
                break; // Stop searching immediately
            }
        }
        if (!isFound) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
