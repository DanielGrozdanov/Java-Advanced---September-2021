package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String inputOne = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String inputTwo = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        List<String> file1 = Files.readAllLines(Path.of(inputOne));
        List<String> file2 = Files.readAllLines(Path.of(inputTwo));

        PrintWriter printWriter = new PrintWriter("outPutMerge.txt");
        file1.forEach(printWriter::println);
        file2.forEach(printWriter::println);
        printWriter.close();
    }
}
