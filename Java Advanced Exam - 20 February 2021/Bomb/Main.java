package Bomb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int bombCounter;
    private static int sapperRow;
    private static int sapperCol;
    private static boolean allBombsFound = false;
    private static boolean endIsReached = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(",");
        List<String> commands = new ArrayList<>(Arrays.asList(input));

        char[][] bombField = new char[size][size];

        for (int row = 0; row < bombField.length; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            bombField[row] = line.toCharArray();

            if (line.contains("s")) {
                sapperRow = row;
                sapperCol = line.indexOf("s");
            }
            for (char c : line.toCharArray()) {
                if (c == 'B') {
                    bombCounter++;
                }
            }

        }


        for (String command : commands) {
            switch (command) {
                case "up":
                    moveSapper(bombField, sapperRow - 1, sapperCol);
                    break;
                case "right":
                    moveSapper(bombField, sapperRow, sapperCol + 1);
                    break;
                case "left":
                    moveSapper(bombField, sapperRow, sapperCol - 1);
                    break;
                case "down":
                    moveSapper(bombField, sapperRow + 1, sapperCol);
                    break;
            }
        }
        if (allBombsFound) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (endIsReached) {
            System.out.println("END! " + bombCounter + " bombs left on the field");
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombCounter, sapperRow, sapperCol);
        }

        System.out.println();
    }

    private static void moveSapper(char[][] bombField, int r    , int c) {

        if (isOutOfBounds(bombField, r, c) || allBombsFound || endIsReached) {
            return;
        }

        char nextStep = bombField[r][c];

        //defuse bomb
        if (nextStep == 'B') {
            System.out.println("You found a bomb!");
            bombCounter--;
            if (bombCounter == 0) {
                allBombsFound = true;
                return;
            }
        } else if (nextStep == 'e') {
            endIsReached = true;
            return;
        }

        bombField[sapperRow][sapperCol] = '+';
        bombField[r][c] = 's';
        sapperRow = r;
        sapperCol = c;
    }

    private static boolean isOutOfBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0 || c >= matrix[r].length;
    }
}
