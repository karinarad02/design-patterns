package Pb7.main;

import Pb7.clase.Facade;
import Pb7.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana("Horatiu",45,false,false);
        System.out.println("Fara Facade:");
        persoana.verificaVarsta();
        persoana.verificaUrmarire();
        persoana.verificaCreante();
        System.out.println("Cu Facade");
        Facade facade=new Facade(persoana);
        facade.verificaPeroana();

    }
}
