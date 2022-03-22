package store;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {5, 7, 9, 2, 1}, {0, 9, 1, 8, 7}, {99, 100, -2, 3, 1}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (((i + j) == matrix.length) && (i != j) && (min > matrix[i][j])) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
