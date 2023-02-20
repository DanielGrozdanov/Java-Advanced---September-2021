package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLinesV3 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> strings = Files.readAllLines(Path.of(path));
//
//        for (String string : strings) {
//            int sum = 0;
//            for (int i = 0; i < string.length(); i++) {
//                char current = string.charAt(i);
//                sum += current;
//            }
//            System.out.println(sum );
//        }

        strings.stream().map(entry -> entry.chars().sum()).forEach(System.out::println);
    }
}
