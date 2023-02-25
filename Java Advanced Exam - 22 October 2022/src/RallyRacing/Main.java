package RallyRacing;

import java.util.Scanner;

public class Main {
    private static int tunnel1Row;
    private static int tunnel1Col;

    private static int tunnel2Row;
    private static int tunnel2Col;

    private static int carStartPositionRow = 0;
    private static int carStartPositionCol = 0;

    private static int tunnelFound = 0;
    private static int kilometersCovered = 0;

    private static boolean hasFinished = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String car = scanner.nextLine();

        char[][] matrix = new char[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            matrix[row] = line.toCharArray();

            EntryExitTunnelsAndFinishLine(row, line);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            if (hasFinished) {
                break;
            }
            switch (commands) {
                case "up":
                    drive(car, matrix, carStartPositionRow - 1, carStartPositionCol);
                    break;
                case "down":
                    drive(car, matrix, carStartPositionRow + 1, carStartPositionCol);
                    break;
                case "left":
                    drive(car, matrix, carStartPositionRow, carStartPositionCol - 1);
                    break;
                case "right":
                    drive(car, matrix, carStartPositionRow, carStartPositionCol + 1);
                    break;
            }
            commands = scanner.nextLine();
        }


        if (!hasFinished) {
            System.out.println("Racing car " + car + " DNF.");
            matrix[carStartPositionRow][carStartPositionCol] = 'C';
            System.out.println("Distance covered " + kilometersCovered + " km.");
        }
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void drive(String car, char[][] matrix, int row, int col) {

        if (isOutOfBounds(matrix, row, col)) {
            return;
        }

        char nextPosition = matrix[row][col];

        if (nextPosition == 'F') {
            matrix[row][col] = 'C';
            kilometersCovered += 10;
            System.out.println("Racing car " + car + " finished the stage!");
            System.out.println("Distance covered " + kilometersCovered + " km.");
            hasFinished = true;
            return;
        } else if (nextPosition == 'T') {
            matrix[tunnel1Row][tunnel1Col] = '.';
            carStartPositionRow = tunnel2Row;
            carStartPositionCol = tunnel2Col;
            matrix[tunnel2Row][tunnel2Col] = '.';
            kilometersCovered += 30;
        } else {
            carStartPositionRow = row;
            carStartPositionCol = col;
            kilometersCovered += 10;
        }
    }

    private static boolean isOutOfBounds(char[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    private static void EntryExitTunnelsAndFinishLine(int row, String line) {
        if (tunnelFound == 0 && line.contains("T")) {
            tunnel1Row = row;
            tunnel1Col = line.indexOf("T");
            tunnelFound++;
        } else if (tunnelFound == 1 && line.contains("T")) {
            tunnel2Row = row;
            tunnel2Col = line.indexOf("T");
        }
    }
}
