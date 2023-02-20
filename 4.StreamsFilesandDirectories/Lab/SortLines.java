package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get("D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        List<String> strings = Files.readAllLines(path).stream().sorted().toList();

        BufferedWriter writer = Files.newBufferedWriter(Paths.get("D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt"));

        writer.write(strings.stream().collect(Collectors.joining(System.lineSeparator())).trim());
        writer.close();
    }
}
