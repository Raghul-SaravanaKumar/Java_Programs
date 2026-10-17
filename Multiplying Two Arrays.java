public class ArrayMultiplication {
    public static void main(String[] args) {
        // Define two 2x2 matrices
        int[][] matrixA = { {1, 2}, {3, 4} };
        int[][] matrixB = { {5, 6}, {7, 8} };
        
        // Create a new array to store the product
        int[][] product = new int[2][2];
        
        // Multiplying the two matrices
        for(int i = 0; i < 2; i++) {       // Row of matrixA
            for(int j = 0; j < 2; j++) {   // Column of matrixB
                for(int k = 0; k < 2; k++) { // Inner loop for dot product calculation
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        // Display the result
        System.out.println("Product of the two arrays:");
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
