package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExamples {
    public static void main(String[] args) {
        //Dates are NOT strings
        //We use special classes for dates
        //LocalDate, LocalTime, LocalDateTime
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime currentDateAndCurrentTime = LocalDateTime.now();
        System.out.println(currentDateAndCurrentTime);

        //You can add or subtract time from a date to get another date
        LocalDate futureTime = currentDate.plusDays(3);
        System.out.println("3 days from now is: " + futureTime);

        //UTC is what you normally deal with time
        //Let's say you want the date to look a certain way
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formatted = LocalDateTime.now().format(formatter);
        System.out.println(formatted);

    }
}
