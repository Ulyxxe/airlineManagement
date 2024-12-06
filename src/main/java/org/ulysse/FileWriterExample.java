package org.ulysse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {
    public static void main(String[] args) {
        String filePath = "src/main/resources/lyrics.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.newLine();
            bufferedWriter.write("Hello Everyone !");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
