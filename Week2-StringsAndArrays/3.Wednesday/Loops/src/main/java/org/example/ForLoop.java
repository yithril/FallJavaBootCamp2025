package org.example;

public class ForLoop {
    public static void main(String[] args) {
        //for loops are when you have a number in mind
        //Run code X amount of times

        for(int i = 0; i < 10; i++){
            System.out.println("i is: " + i);
        }

        //we can moonwalk with our for loops
        for(int j = 20; j > 0; j--){
            System.out.println("j is: " + j);
        }

        //Can we skip?
        for(int k =0; k < 20; k += 2){
            System.out.println("k is: " + k);
        }
    }
}
