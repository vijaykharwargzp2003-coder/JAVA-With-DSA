public class TransposeSquare {
    public static void transpose(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int tb = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = tb;

            }
        }
    }

    public static void printmatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.println(val + "");
            }
            System.out.println();
        }
    }
    public static void  main(String [] args){
        int [][] matrix ={
                {2,4,5},{14,3,4},{9,6,5}
        };
        System.out.println("original matrix:" );
        transpose(matrix);
        System.out.println("\n Transposed Matrix");
        printmatrix(matrix);
}
}