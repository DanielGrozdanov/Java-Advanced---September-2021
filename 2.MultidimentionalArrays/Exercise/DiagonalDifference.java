package JavaAdvanced.MultidimentionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = createMatrix(size, scanner, " ");

        int first = firstDiagonalSum(matrix);
        int second = secondDiagonalSum(matrix);
        System.out.println(Math.abs(first - second));
    }

    private static int secondDiagonalSum(int[][] matrix) {
        int secondDiagonalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(col == matrix.length - row - 1){
                    secondDiagonalSum += matrix[row][col];
                }
            }
        }
        return secondDiagonalSum;
    }

    private static int firstDiagonalSum(int[][] matrix) {
        int firstDiagonalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col){
                    firstDiagonalSum += matrix[row][col];
                }
            }
        }
        return firstDiagonalSum;
    }

    private static int[][] createMatrix(int size, Scanner scanner, String pattern) {
        int[][] matrix = new int[size][];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                            .split(pattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        return matrix;
    }
}