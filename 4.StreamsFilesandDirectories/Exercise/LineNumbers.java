package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outPath = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        PrintWriter printWriter = new PrintWriter(outPath);

        String line = bufferedReader.readLine();
        Map<Integer,String> integerStringMap = new LinkedHashMap<>();

        int counter = 1;
        while (line != null){
            integerStringMap.putIfAbsent(counter,line);
            counter++;
            line = bufferedReader.readLine();
        }
        integerStringMap.entrySet().forEach(entry -> {
            printWriter.println(entry.getKey() + ". " + entry.getValue());
        });

        printWriter.close();
    }
}
