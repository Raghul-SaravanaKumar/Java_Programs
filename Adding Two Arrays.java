public class ArrayAddition {
    public static void main(String[] args) {
        // Define two 2x3 matrices (2 rows, 3 columns)
        int[][] firstArray = { {1, 2, 3}, {4, 5, 6} };
        int[][] secondArray = { {7, 8, 9}, {1, 2, 3} };
        
        // Create a new array to store the sum
        int[][] sum = new int[2][3];
        
        // Loop through rows and columns to add elements
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = firstArray[i][j] + secondArray[i][j];
            }
        }
        
        // Display the result
        System.out.println("Sum of the two arrays:");
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
