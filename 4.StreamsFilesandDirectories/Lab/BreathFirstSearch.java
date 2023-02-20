package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BreathFirstSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get("D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources");

        File root = path.toFile();

        Deque<File> fileDeque = new ArrayDeque<>();

        fileDeque.offer(root);

        //Breadth First Search or BFS for a Graph
        while (!fileDeque.isEmpty()){
            File file = fileDeque.poll();
            File[] files = file.listFiles();
            if (files != null){
                for (File file1 : files) {
                    if(file1.isDirectory()){
                        fileDeque.offer(file1);
                    }else {
                        System.out.println(file1.getName());
                    }
                }
            }
        }
    }
}
