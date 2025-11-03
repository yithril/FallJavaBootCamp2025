package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Talent show!
        //Everybody here is a performer
        //but HOW they perform is up to them
        Magician magician = new Magician("Merlin");
        Juggler juggler = new Juggler("Houdini");
        Dancer dancer = new Dancer("Ariana Grande");
        Manager manager = new Manager();

        List<Performer> performers = new ArrayList<>();

        performers.add(magician);
        performers.add(juggler);
        performers.add(dancer);

        //details
        for(Performer performer : performers){
            performer.perform();

            if(performer instanceof Juggler){
                //downcasting
                ((Juggler) performer).breatheFire();
            }
        }
    }
}