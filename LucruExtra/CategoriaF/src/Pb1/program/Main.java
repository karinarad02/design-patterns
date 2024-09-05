package Pb1.program;

import Pb1.clase.FactoryMijlocTransport;
import Pb1.clase.MijlocTransport;
import Pb1.clase.TipTransport;

public class Main {
    public static void main(String[] args) {
        FactoryMijlocTransport factoryMijlocTransport=new FactoryMijlocTransport();
        MijlocTransport mijlocTransport=factoryMijlocTransport.creareMijlocTransport(TipTransport.AUTOBUZ);
        mijlocTransport.afisare();
    }
}