package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            int read = fileInputStream.read();

            while (read != -1) {
                System.out.printf("%s ", Integer.toBinaryString(read));
                read = fileInputStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
