package Pb10.program;

import Pb10.clase.FlyweightFactory;
import Pb10.clase.Loc;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Loc loc1=new Loc("Tribuna",3,2);
        Loc loc2=new Loc("Peluza",8,9);

        flyweightFactory.getClient("Andrei",25,170,90,"rosu").desenarePersoana(loc1);
        flyweightFactory.getClient("Alex",30,190,110,"albastru").desenarePersoana(loc2);

    }
}