package org.example;

public class Dancer extends Performer{

    public Dancer(String name) {
        super(name);
    }

    @Override
    public void perform(){
        System.out.println("Does the samba.");
    }
}
