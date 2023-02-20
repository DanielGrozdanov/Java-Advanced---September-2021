package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SumLinesV2 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        FileInputStream fileInputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();

        while (line != null) {
        int lineSum = 0;
            for (char c : line.toCharArray()) {
                lineSum += c;
            }
            System.out.println(lineSum);
            line = bufferedReader.readLine();
        }
    }
}
