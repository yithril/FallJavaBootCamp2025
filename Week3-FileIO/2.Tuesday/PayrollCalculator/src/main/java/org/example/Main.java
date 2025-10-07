package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/main/resources/employees.csv");
            BufferedReader reader = new BufferedReader(fr);
            List<Employee> employeeList = new ArrayList<>();
            String line;
            while((line = reader.readLine()) != null){
                String[] employeeData = line.split("\\|");
                //id is index 0, index 1 is name, 2 is hours worked, 3 is payrate
                Employee newEmployee = new Employee();
                newEmployee.setId(Integer.parseInt(employeeData[0]));
                newEmployee.setName(employeeData[1]);
                newEmployee.setHoursWorked(Double.parseDouble(employeeData[2]));
                newEmployee.setPayRate(Double.parseDouble(employeeData[3]));

                employeeList.add(newEmployee);
            }


        }
        catch(FileNotFoundException ex){

        }
        catch(IOException ex){

        }
    }
}