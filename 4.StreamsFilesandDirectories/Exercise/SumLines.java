package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        FileInputStream fileInputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        List<Integer> result = new ArrayList<>();

        int lineSum = 0;
       while (line != null){
           for (int i = 0; i < line.length(); i++) {
               char currentChar = line.charAt(i);
                lineSum+= currentChar;
           }
           result.add(lineSum);
           lineSum = 0;
           line = bufferedReader.readLine();
       }

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
