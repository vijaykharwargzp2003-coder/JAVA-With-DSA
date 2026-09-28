public class main8 {
    static int[][] multiply(int[][] A, int[][] B) {
        int r = A.length, k = A[0].length, c = B[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int t = 0; t < k; t++) {
                    C[i][j] += A[i][t] * B[t][j];
                }
            }
        }
        return C;
    }
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };
        int[][] C = multiply(A, B);
          System.out.println(" Matrix A:");
          printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);
        System.out.println("\nResult of AxB:");
        printMatrix(C);
    }
}