package Pb7.main;

import Pb7.clase.casaDeBilete.Bilet;
import Pb7.clase.casaDeBilete.BiletAbstract;
import Pb7.clase.decorator.BiletZiNationala;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet1=new Bilet("Ion","23/04/2002");
        bilet1.printareBilet();
        BiletAbstract bilet2=new BiletZiNationala(bilet1);
        bilet2.printareBilet();

    }
}
