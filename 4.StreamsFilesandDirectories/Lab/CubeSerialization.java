package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CubeSerialization {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\cube.txt";

        Cube cube = new Cube("Red",15.3,12.4,3);

        ObjectOutputStream ser = new ObjectOutputStream(new FileOutputStream(path));
        ser.writeObject(cube);

        System.out.println();
    }
}
