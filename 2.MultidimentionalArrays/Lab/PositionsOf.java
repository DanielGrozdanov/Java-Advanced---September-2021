package JavaAdvanced.MultidimentionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);
        int[][] matrix = readMatrix(rows, scanner);
        int numberToCheck = Integer.parseInt(scanner.nextLine());

        ArrayList<int[]> indexes = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberToCheck) {
                    int[] foundAt = {row, col};
                    indexes.add(foundAt);
                }
            }
        }
        if (indexes.isEmpty()) {
            System.out.println("not found");
        } else {
//            for (int[] index : indexes) {
//                System.out.println(index[0] + " " + index[1]);
//            }
            String output = indexes.stream().map(arr -> arr[0] + " " + arr[1])
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(output);
        }
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] =
                    Arrays.stream(scanner.nextLine()
                                    .split("\\s+"))
                            .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
