package org.example;

public class Split {
    public static void main(String[] args) {
        String example = "10|Dana Wyatt|52.5|12.50";

        String[] employeeData= example.split("\\|");

        System.out.println(employeeData[1]);
    }
}
