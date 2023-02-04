package JavaAdvanced.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int sum = 0;
        sum = getSum(scanner, rows, sum);

        System.out.println(rows + "\n" + cols + "\n" + sum);
    }

    private static int getSum(Scanner scanner, int rows, int sum) {
        int[][] matrix = readMatrix(rows, scanner, ",\\s+");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
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
}
