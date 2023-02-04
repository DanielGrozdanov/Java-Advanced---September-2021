package JavaAdvanced.MultidimentionalArrays.Exercise;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner, rows);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (!isValid(command, rows, cols)) {
                System.out.println("Invalid input!");
            }else {
                swapElementsAndPrintMatrix(matrix, command);
            }

            command = scanner.nextLine();
        }
    }

    private static void swapElementsAndPrintMatrix(String[][] matrix, String command) {
        String[] commandParts = command.split("\\s+");
        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        String element1 = matrix[row1][col1];
        String element2 = matrix[row2][col2];
        matrix[row1][col1] = element2;
        matrix[row2][col2] = element1;

        printMatrix(matrix);
    }

    private static boolean isValid(String command, int rows, int cols) {
        String[] commandParts = command.split("\\s+");
        if (!commandParts[0].equals("swap")) {
            return false;
        }
        if (commandParts.length != 5) {
            return false;
        }

        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        return row1 >= 0 && row1 < rows && row2 >= 0 && row2 < rows && col1 >= 0 && col1 < cols && col2 >= 0 && col2 < cols;
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner, int rows) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
