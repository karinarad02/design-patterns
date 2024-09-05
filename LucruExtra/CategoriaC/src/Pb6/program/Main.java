package Pb6.program;

import Pb6.clase.FacadeFarmacist;
import Pb6.clase.Farmacist;

public class Main {
    public static void main(String[] args) {
        Farmacist farmacist=new Farmacist();
        System.out.println("\nFara facade: ");
        farmacist.verificaReteta();
        farmacist.verificaDisponibilitateMedicament();
        farmacist.verificaCardSanatate();
        System.out.println("\nCu facade: ");
        FacadeFarmacist facadeFarmacist=new FacadeFarmacist(farmacist);
        facadeFarmacist.verificariAchizitieMedicament();
    }
}