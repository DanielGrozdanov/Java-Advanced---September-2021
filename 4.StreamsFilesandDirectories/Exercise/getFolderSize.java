package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class getFolderSize {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);
        File[] files = folder.listFiles();
        long size = 0;
        for (File file : files) {
            long length = file.length();
            size+= length;
        }
        System.out.println("Folder size: " + size);
    }
}
