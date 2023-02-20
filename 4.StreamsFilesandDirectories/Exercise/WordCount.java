package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String checkFile = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";


        PrintWriter printWriter = new PrintWriter("result.txt");

        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> strings = Files.readAllLines(Path.of(path));
        for (String string : strings) {
            String[] s = string.split(" ");
            for (String s1 : s) {
                map.put(s1, 0);
            }
        }

        List<String> checkWords = Files.readAllLines(Path.of(checkFile));
        for (String checkWord : checkWords) {
            String[] s = checkWord.split(" ");
            for (String s1 : s) {
                if (map.containsKey(s1)){
                    map.put(s1, map.get(s1) + 1);
                }
            }
        }

        map.forEach((key, value) -> printWriter.println(key + " - " + value));
        printWriter.close();

    }
}
