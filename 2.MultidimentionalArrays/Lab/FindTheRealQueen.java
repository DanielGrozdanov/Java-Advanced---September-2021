package JavaAdvanced.MultidimentionalArrays.Lab;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        fillMatrix(matrix, scanner);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char checkChar = matrix[row][col];
                if (checkChar == 'q') {
                    if (validQueen(matrix, row, col)) {
                        System.out.println(row + " " + col);
                    }
                }
            }
        }
    }

    private static boolean validQueen(char[][] matrix, int row, int col) {

        for (int i = col + 1; i < matrix[row].length; i++) {      //right
            char checkChar = matrix[row][i];
            if (checkChar == 'q') {
                return false;
            }
        }

        for (int i = col - 1; i >= 0; i--) {    // left
            char checkChar = matrix[row][i];
            if (checkChar == 'q') {
                return false;
            }
        }

        for (int i = row + 1; i < matrix.length; i++) { // down
            char checkChar = matrix[i][col];
            if (checkChar == 'q') {
                return false;
            }
        }

        for (int i = row - 1; i >= 0; i--) { // up
            char checkChar = matrix[i][col];
            if (checkChar == 'q') {
                return false;
            }
        }

        int el = col - 1;
        for (int i = row - 1; i >= 0 && el >= 0; i--, el--) { // topLeftDiagonal
            char checkChar = matrix[i][el];
            if (checkChar == 'q') {
                return false;
            }
        }

        int el1 = col + 1;
        for (int i = row - 1; i >= 0 && el1 < matrix[row].length; i--, el1++) { //topRightDiagonal
            char checkChar = matrix[i][el1];

            if (checkChar == 'q') {
                return false;
            }
        }

        int el2 = col - 1;
        for (int i = row + 1; i < matrix.length && el2 >= 0; i++, el2--) { // bottomLeftDiagonal
            char checkChar = matrix[i][el2];
            if (checkChar == 'q') {
                return false;
            }
        }

        int el3 = col + 1;
        for (int i = row + 1; i < matrix.length && el3 < matrix[row].length; i++, el3++) { // bottomRightDiagonal
            char checkChar = matrix[i][el3];
            if (checkChar == 'q') {
                return false;
            }
        }

        return true;
    }

    public static boolean isInBounds(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static void fillMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String input = scanner.nextLine();
            matrix[row] = input.replace(" ","").toCharArray();
        }
    }
}
