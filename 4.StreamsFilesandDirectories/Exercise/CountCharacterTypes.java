package JavaAdvanced.StreamsFilesandDirectories.Exercise;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath = "D:\\Desktop\\Java Refresh\\JavaAdvanced\\StreamsFilesandDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\new-file.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        PrintWriter printWriter = new PrintWriter(outPath);

        String line = bufferedReader.readLine();
        LinkedHashMap<String, Integer> charTypes = new LinkedHashMap<>();
        charTypes.put("Vowels", 0);
        charTypes.put("Other symbols", 0);
        charTypes.put("Punctuation", 0);
        while (line != null) {
            char[] chars = line.toCharArray();
            findCharTypes(charTypes, chars);
            line = bufferedReader.readLine();
        }

        for (Map.Entry<String, Integer> s : charTypes.entrySet()) {
            String key = s.getKey();
            Integer value = s.getValue();
            printWriter.println(key + ": " + value);
        }
        printWriter.close();
    }

    private static void findCharTypes(LinkedHashMap<String, Integer> charTypes, char[] chars) {
        for (char aChar : chars) {
            if (aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u') {
                charTypes.put("Vowels", charTypes.get("Vowels") + 1);
            } else if (aChar == '!' || aChar == ',' || aChar == '.' || aChar == '?') {
                charTypes.put("Punctuation", charTypes.get("Punctuation") + 1);
            } else if (aChar == ' ') {
                continue;
            } else {
                charTypes.put("Other symbols", charTypes.get("Other symbols") + 1);
            }
        }
    }
}
