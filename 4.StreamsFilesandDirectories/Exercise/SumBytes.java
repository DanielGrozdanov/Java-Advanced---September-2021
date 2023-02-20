package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        FileInputStream fileInputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();

        long sum = 0;
        while (line != null) {
            for (char c : line.toCharArray()) {
                sum += c;
            }
            line = bufferedReader.readLine();
        }
        System.out.println(sum);
    }
}
