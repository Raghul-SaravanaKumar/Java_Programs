import java.util.*;

class TwoSum {
    // Brute-force approach: O(n^2) time complexity
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // Return empty array if no pair matches
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum solver = new TwoSum();

        // 1. Get the size of the array
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // 2. Initialize and populate the array
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 3. Get the target sum
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        // 4. Calculate results
        int[] result = solver.twoSum(nums, target);

        // 5. Output the indices
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to the target.");
        }

        sc.close();
    }
}
