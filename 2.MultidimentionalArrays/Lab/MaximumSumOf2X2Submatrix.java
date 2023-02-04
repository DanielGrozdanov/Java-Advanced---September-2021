package JavaAdvanced.MultidimentionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        3, 6
//        7, 1, 3, 3, 2, 1
//        1, 3, 9, 8, 5, 6
//        4, 6, 7, 9, 1, 0

        int rows = Integer.parseInt(scanner.nextLine().split(", ")[0]);
        int[][] matrix = readMatrix(rows, scanner, ",\\s+");
        int sum = 0;
        int[][] bestMatrix = new int[2][2];

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int mainRow = matrix[row][col];
                int topRightRow = matrix[row][col + 1];
                int bottomLeft = matrix[row + 1][col];
                int bottomRight = matrix[row + 1][col + 1];

                int currentSum = mainRow + topRightRow + bottomLeft + bottomRight;

                if (sum < currentSum) {
                    sum = currentSum;
                    bestMatrix = new int[][]{
                            {mainRow, topRightRow},
                            {bottomLeft, bottomRight}
                    };
                }
            }
        }
        printMatrixAndSum(bestMatrix, sum);
    }

    private static void printMatrixAndSum(int[][] matrix, int sum) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }

    private static int[][] readMatrix(int rows, Scanner scanner, String pattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                            .split(pattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        return matrix;
    }
}
