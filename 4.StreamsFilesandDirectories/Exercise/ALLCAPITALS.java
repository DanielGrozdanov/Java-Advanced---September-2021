package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.*;
import java.util.Locale;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\OUTPUT.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        PrintWriter printWriter = new PrintWriter(outPath);

        String line = bufferedReader.readLine();

        while (line != null) {
            String upperCase = line.toUpperCase();
            printWriter.println(upperCase);
            line = bufferedReader.readLine();
        }
        printWriter.close();
    }
}
