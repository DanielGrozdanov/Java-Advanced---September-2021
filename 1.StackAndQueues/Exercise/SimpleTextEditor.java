package JavaAdvanced.StackAndQueues.Exercise;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> wordState = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder textState = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            //•"1 {string}" - appends[string] to the end of the text.
            //•"2 {count}" - erases the last[count]elements from the text.
            //•"3 {index}" - returns the element at position[index]from the text.
            //•"4" - undoes the last not - undone command of type 1 or 2 and returns the text to the state before that operation.

            String commandNumber = command.split("\\s+")[0];
            switch (commandNumber) {
                case "1":
                    String text = command.split("\\s+")[1];
                    textState.append(text);
                    wordState.push(textState.toString());
                    break;
                case "2":
                    int count = Integer.parseInt(command.split("\\s+")[1]);
                    int start = textState.length() - count;
                    textState.delete(start, textState.length());
                    wordState.push(textState.toString());
                    break;
                case "3":
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(textState.charAt(index - 1));
                    break;
                case "4":
                    if (wordState.size() > 1) {
                        wordState.pop();
                        textState = new StringBuilder(wordState.peek());
                    } else {
                        textState = new StringBuilder();
                    }
                    break;
            }
        }
    }
}
