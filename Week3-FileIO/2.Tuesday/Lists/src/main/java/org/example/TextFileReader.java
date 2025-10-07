package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
    public static void main(String[] args) {
        //We need something to open the file

        try{
            FileReader fr = new FileReader("src/main/resources/mary_had_a_little_lamb.txt");
            //Great the file is open, but we need to go through the file
            BufferedReader reader = new BufferedReader(fr);

            //Let's actually go through the file line by line
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Could not find the file.");
        }
        catch(IOException ex){
            System.out.println("File had a problem with it.");
        }
    }
}
