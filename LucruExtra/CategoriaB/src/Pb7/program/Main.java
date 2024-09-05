package Pb7.program;

import Pb7.clase.AbstractNotaDePlata;
import Pb7.clase.NotaDePlata;
import Pb7.clase.Produs;
import Pb7.decoratoare.DecoratorAnNou;

public class Main {
    public static void main(String[] args) {
        AbstractNotaDePlata notaDePlata=new NotaDePlata("Pizza Hut");
        Produs pizza=new Produs("Europeana",45.0);
        Produs paste=new Produs("Bolognese",35.0);
        Produs cookie=new Produs("Cookie Dough",20.0);
        notaDePlata.adaugareProdus(pizza);
        notaDePlata.adaugareProdus(paste);
        notaDePlata.adaugareProdus(cookie);
        notaDePlata.calculeazaTotal();
        System.out.println("Rezultat simplu");
        notaDePlata.printareNota();

        System.out.println("\nRezultat decorat");
        DecoratorAnNou anNou=new DecoratorAnNou(notaDePlata);
        anNou.printareNota();
    }
}
