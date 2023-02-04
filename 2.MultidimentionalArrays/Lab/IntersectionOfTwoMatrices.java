package JavaAdvanced.MultidimentionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int cols = Integer.parseInt(scanner.nextLine().split(" ")[0]);

        char[][] firstMatrix = fillMatrix(scanner, rows, cols);
        char[][] secondMatrix = fillMatrix(scanner, rows, cols);
        char[][] resultMatrix = new char[rows][cols];


        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                char fillCharacter = firstMatrix[row][col] == secondMatrix[row][col]
                        ? firstMatrix[row][col]
                        : '*';
                resultMatrix[row][col] = fillCharacter;
            }
        }

        printMatrix(resultMatrix);
    }

    private static void printMatrix(char[][] resultMatrix) {
        for (int row = 0; row < resultMatrix.length; row++) {
            for (int col = 0; col < resultMatrix[row].length; col++) {
                System.out.print(resultMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] fillMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            char[] el = line.replaceAll("\\s+", "").toCharArray();
            matrix[row] = el;

//            String[] elements = line.split("\\s+");
//            for (int i = 0; i < elements.length; i++) {
//                char current = elements[i].charAt(0);
//                matrix[row][i] = current;
//            }

        }
        return matrix;
    }
}
