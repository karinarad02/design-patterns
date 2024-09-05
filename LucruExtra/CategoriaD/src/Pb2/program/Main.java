package Pb2.program;

import Pb2.clase.FactoryPersoanaFizica;
import Pb2.clase.IFactoryPersoana;
import Pb2.clase.IPersoana;

public class Main {
    public static void main(String[] args) {
        IFactoryPersoana factoryPersoana=new FactoryPersoanaFizica();
        IPersoana persoana= factoryPersoana.crearePersoana();
        persoana.afisare();
    }
}