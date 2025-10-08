package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/employees.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\n90|Bob Jones|40|10.25");

            //once you're finished writing
            bufferedWriter.close();
        }
        catch(IOException ex){
            System.out.println("Something went wrong with the file, try again.");
        }
    }
}
