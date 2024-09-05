package Pb7.program;

import Pb7.clase.Rezultat;
import Pb7.clase.RezultatAbstract;
import Pb7.decoratoare.DecoratorRezultat;
import Pb7.decoratoare.RezultatOnline;
import Pb7.decoratoare.RezultatPrintat;

public class Main {
    public static void main(String[] args) {
        RezultatAbstract rezultatAbstract=new Rezultat("1234","Ion Popescu","pneumonie",305.7);
        System.out.println("Rezultat simplu");
        rezultatAbstract.printareRezultat();
        System.out.println("\nRezultat online");
        DecoratorRezultat decoratorOnline=new RezultatOnline(rezultatAbstract);
        decoratorOnline.printareRezultat();
        System.out.println("\nRezultat printat");
        DecoratorRezultat decoratorPrintat=new RezultatPrintat(rezultatAbstract);
        decoratorPrintat.printareRezultat();
    }
}