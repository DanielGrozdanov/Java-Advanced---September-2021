package JavaAdvanced.MultidimentionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int[][] matrix = readMatrix(size, scanner, " ");
        int[][] bestMatrix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = 0;
                sum +=
                        matrix[row][col] +
                                matrix[row][col + 1] +
                                matrix[row][col + 2] +
                                matrix[row + 1][col] +
                                matrix[row + 1][col + 1] +
                                matrix[row + 1][col + 2] +
                                matrix[row + 2][col] +
                                matrix[row + 2][col + 1] +
                                matrix[row + 2][col + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    bestMatrix[0][0] = matrix[row][col];
                    bestMatrix[0][1] = matrix[row][col + 1];
                    bestMatrix[0][2] = matrix[row][col + 2];
                    bestMatrix[1][0] = matrix[row + 1][col];
                    bestMatrix[1][1] = matrix[row + 1][col + 1];
                    bestMatrix[1][2] = matrix[row + 1][col + 2];
                    bestMatrix[2][0] = matrix[row + 2][col];
                    bestMatrix[2][1] = matrix[row + 2][col + 1];
                    bestMatrix[2][2] = matrix[row + 2][col + 2];
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int bestRow = 0; bestRow < bestMatrix.length; bestRow++) {
            for (int bestCol = 0; bestCol < bestMatrix[bestRow].length; bestCol++) {
                System.out.print(bestMatrix[bestRow][bestCol] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(int size, Scanner scanner, String pattern) {
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
