package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter writer = new BufferedWriter(new PrintWriter("D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt"));

        String line = bufferedReader.readLine();

        int count = 1;

        while (line != null){
            if (count % 3 == 0){
                writer.write(line + System.lineSeparator());
            }
            count++;
            line = bufferedReader.readLine();
        }
        writer.flush();
    }
}
