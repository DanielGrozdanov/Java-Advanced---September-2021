package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;


public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String write = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";


        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(write);
        int value = fileInputStream.read();

        Set<Character> characterSet = Set.of(',', '.', '!', '?');

        while (value != -1) {
            char current = (char) value;
            if (!characterSet.contains(current)){
                fileOutputStream.write(current);
            }
            value = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
