package main;

import clase.AchizitieMedicamente;
import clase.AchizitiePeBazaDeReteta;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta=new Reteta(1);
//        reteta.adaugareMedicamente("Fervex");
        reteta.adaugareMedicamente("Paracetamol");
        reteta.adaugareMedicamente("Nurofen");

        AchizitieMedicamente achizitieMedicamente=new AchizitiePeBazaDeReteta(reteta);
        achizitieMedicamente.achizitioneazaMedicamente();


    }
}