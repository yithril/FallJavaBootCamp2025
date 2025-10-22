package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {
    //Tests are just methods
    //You write a method, and you annotate it
    //Test methods return void
    //Name the method what you are testing
    @Test
    public void kingSizeRoom_NotWeekend(){
        //There are three parts to a unit test
        //Arrange, Act, Assert
        //Arrange is prepare whatever data you need to run the test
        Reservation reservation = new Reservation("king", 3, false);

        //Act
        //Do the test
        double expectedPrice = reservation.getReservationTotal();

        //Assert
        assertEquals(417, expectedPrice);
    }

    //test case where its a double room on the weekend for 5 nights
    @Test
    public void doubleRoom_Weekend(){
        //Arrange, Act, Assert
        Reservation reservation = new Reservation("double", 5, true);

        double expectedPrice = reservation.getReservationTotal();

        assertEquals(682, expectedPrice);
        //you can have more than one assertion in a single test
    }

    //ADVANCED
    //Parameterized tests
    //You spell out what parameters there are, and then JUnit will run the test multiple times
    @ParameterizedTest
    @CsvSource({"double, 3, true, 409.2", "double, 3, false, 372", "king, 3, true, 458.7", "king, 3, false, 417"})
    public void testReservationTotal(String roomType, int numberOfNights, boolean isWeekend,
                                     double expectedPrice){
        Reservation reservation = new Reservation(roomType, numberOfNights, isWeekend);

        double testPrice = reservation.getReservationTotal();

        assertEquals(expectedPrice, testPrice);
    }

}