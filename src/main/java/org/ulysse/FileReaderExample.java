package org.ulysse;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "src/main/resources/lyrics.txt";

                try{
                    FileReader fileReader = new FileReader(filePath);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    while ((line = bufferedReader.readLine() )!= null)
                        System.out.println(line);
                    bufferedReader.close();
                }
                catch (IOException e){
                    System.out.println("We have an IO Exception");
                }


    }
}
