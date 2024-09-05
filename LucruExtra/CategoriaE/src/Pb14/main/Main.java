package Pb14.main;

import Pb14.clase.Bilet;
import Pb14.clase.Intrare;
import Pb14.clase.IntrarePeStadion;

public class Main {
    public static void main(String[] args) {
        Bilet bilet=new Bilet("Florin",5);
        Intrare intrare=new IntrarePeStadion(bilet);
        intrare.intrarePeStadion();
    }
}