package org.example;

import java.util.List;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice(){
        if(roomType.equalsIgnoreCase("king")){
            return 139;
        }
        else{
            return 124;
        }
    }

    public double getReservationTotal(){
        if(isWeekend){
            return getPrice() * 1.1 * numberOfNights;
        }
        else{
            return getPrice() * numberOfNights;
        }
    }

    public void filterBelowThreshold(List<Integer> integerList, int threshold){

    }
}
