package org.example;

public class Juggler extends Performer{
    public Juggler(String name) {
        super(name);
    }

    public void breatheFire(){
        System.out.println("Breathes fire.");
    }

    @Override
    public void perform(){
        System.out.println("Juggles chainsaws.");
    }
}
