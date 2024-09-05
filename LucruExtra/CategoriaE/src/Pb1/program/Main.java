package Pb1.program;

import Pb1.clase.FactoryJucator;
import Pb1.clase.IJucator;
import Pb1.clase.TipJucator;

public class Main {
    public static void main(String[] args) {
        FactoryJucator factoryJucator=new FactoryJucator();
        try {
            IJucator jucator=factoryJucator.creareJucator(TipJucator.ATACANT);
            jucator.afisare();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}