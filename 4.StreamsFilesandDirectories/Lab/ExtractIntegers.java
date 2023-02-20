package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {


        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String write = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";


        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(write);

        PrintStream printStream = new PrintStream(fileOutputStream);
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                printStream.println(number);
            }

            scanner.next();
        }
    }
}
