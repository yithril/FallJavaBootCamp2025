package org.example;

public class Magician extends Performer{

    public Magician(String name) {
        super(name);
    }

    //override the perform method in the parent
    //The method signature must be the same
    @Override
    public void perform(){
        System.out.println("Performs a magic trick.");
    }
}
