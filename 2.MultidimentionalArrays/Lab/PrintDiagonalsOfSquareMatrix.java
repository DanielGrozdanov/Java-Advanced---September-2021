package JavaAdvanced.MultidimentionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int[][] matrix = readMatrix(size, scanner, " ");
//        3
//        1 2 3
//        1 2 3
//        1 2 3

        int row = 0, col = 0;

        while (row < size && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();

        row = size - 1;
        col = 0;
        while (row >= 0 && col < size){
            int current = matrix[row][col];
            System.out.print(current + " ");
            row--;
            col++;
        }
        System.out.println();
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
