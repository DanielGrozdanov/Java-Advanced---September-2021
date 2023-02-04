package JavaAdvanced.MultidimentionalArrays.Exercise;

import java.util.Scanner;

public class fillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String command = input[1];
        int[][] matrix = new int[size][size];

        switch (command) {
            case "A":
                fillMatrixPatternA(matrix);
                printMatrix(matrix);
                break;
            case "B":
                fillMatrixPatternB(matrix);
                printMatrix(matrix);
                break;
        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = number++;
                }
            }else {
                for (int row = matrix.length - 1; row >= 0 ; row--) {
                    matrix[row][col] = number++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = number++;
            }
        }
    }

}
