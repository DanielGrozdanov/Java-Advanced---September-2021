package JavaAdvanced.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;


public class ReadMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // cols //   0 1 2 3
        //0 - row // 1,5,6,7
        //1 - row // 2,53,45,8
        //3 - row // 3,11,23,4

        int rows = 3;
        int cols = 3;
        int[][] matrix = readMatrix(rows,cols,scanner);

        System.out.println(matrix);
    }

    public static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = array;
        }
        return matrix;
    }
}
