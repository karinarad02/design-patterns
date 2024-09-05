package Pb2.program;

import Pb2.clase.FactoryFundas;
import Pb2.clase.IFactoryJucator;
import Pb2.clase.IJucator;

public class Main {
    public static void main(String[] args) {
        IFactoryJucator factoryJucator=new FactoryFundas();
        IJucator jucator= factoryJucator.creareJucator();
        jucator.afisare();
    }
}