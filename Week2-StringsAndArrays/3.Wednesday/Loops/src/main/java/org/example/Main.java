package org.example;

public class Main {
    public static void main(String[] args) {
        //two loops while and for
        //while -> do this code until I tell you to stop

        boolean dormammuHasHadEnough = false;
        int counter = 0;

        while(dormammuHasHadEnough == false){
            System.out.println("Dormammu I've come to bargain.");
            System.out.println("Dormammu destroys Dr. Strange");
            counter++;

            if(counter >= 10){
                break;
            }
        }

        System.out.println("Dr. Strange has saved the earth.");
    }
}