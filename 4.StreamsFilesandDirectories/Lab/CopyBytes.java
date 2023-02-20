package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String write = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";


        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(write);
        PrintStream out = new PrintStream(fileOutputStream);

        int read = fileInputStream.read();

        while (read != -1) {
            if (read != 32 && read != 10) {
                out.print(read);
            } else {
                out.print((char) read);
            }
            read = fileInputStream.read();
        }
    }
}
