package JavaAdvanced.StreamsFilesandDirectories.Lab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = List.of(5,6,7,1,2,3);

//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ser-out.txt"));
//
//        outputStream.writeObject(list);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ser-out.txt"));

        List<Integer> result = (List<Integer>) inputStream.readObject();

        System.out.println();
    }
}
