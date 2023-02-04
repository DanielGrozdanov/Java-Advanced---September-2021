package JavaAdvanced.MultidimentionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReadJaggedMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //0 - row // 1,5,6,7,4,5,6
        //1 - row // 2,53,45,8,3
        //3 - row // 3,11,23,4

        int rows = 3;
        int[][] matrix = readMatrix(rows, scanner);

        System.out.println(matrix);
    }

    public static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
//
//    int[][] matrix = new int[rows][];
//        for (int row = 0; row < rows; row++) {
//        int[] array = Arrays.stream(scanner.nextLine().split(","))
//               .mapToInt(Integer::parseInt)
//                  .toArray();
//        matrix[row] = new int[array.length];

//        for (int col = 0; col < array.length; col++) {
//        matrix[row][col] = array[col];
//   }
// }