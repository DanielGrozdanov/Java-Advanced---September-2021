package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Path path = Paths.get("D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources");

        File root = path.toFile();

        dfs(root);
    }

    private static void dfs(File root) {
        System.out.println(root.getName());

        File[] files = root.listFiles();
        if(files != null){
            for (File file : files) {
                if(file.isDirectory()){
                    dfs(file);
                }else {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
