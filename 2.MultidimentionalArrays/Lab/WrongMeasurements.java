package JavaAdvanced.MultidimentionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(size, scanner, "\\s+");
        int[] measurements = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<int[]> list = new ArrayList<>();

        int wrongValue = matrix[measurements[0]][measurements[1]];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (wrongValue == matrix[r][c]) {
                    list.add(new int[]{r, c, getSumOfItems(r, c, matrix, wrongValue)});

                }
            }
        }
        for (int[] ints : list) {
            matrix[ints[0]][ints[1]] = ints[2];
        }

        printMatrix(matrix);

    }

    private static int getSumOfItems(int r, int c, int[][] matrix, int value) {
        int sum = 0;

        if (isInBounds(r, c + 1, matrix) && matrix[r][c + 1] != value) {
            sum += matrix[r][c + 1];
        }
        if (isInBounds(r, c - 1, matrix) && matrix[r][c - 1] != value) {
            sum += matrix[r][c - 1];
        }

        if (isInBounds(r + 1, c, matrix) && matrix[r + 1][c] != value) {
            sum += matrix[r + 1][c];
        }

        if (isInBounds(r - 1, c, matrix) && matrix[r - 1][c] != value) {
            sum += matrix[r - 1][c];
        }
        return sum;
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

    private static void printMatrix(int[][] resultMatrix) {
        for (int row = 0; row < resultMatrix.length; row++) {
            for (int col = 0; col < resultMatrix[row].length; col++) {
                System.out.print(resultMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    public static boolean isOutOfBounds(int row, int col, int[][] matrix) {
        return !isInBounds(row, col, matrix);
    }
}
