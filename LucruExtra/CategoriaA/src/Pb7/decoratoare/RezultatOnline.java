package Pb7.decoratoare;

import Pb7.clase.RezultatAbstract;

public class RezultatOnline extends DecoratorRezultat{
    public RezultatOnline(String cod, String numePacient, String diagnostic, double sumaPlata) {
        super(cod, numePacient, diagnostic, sumaPlata);
    }

    public RezultatOnline(RezultatAbstract rezultatDecorat) {
        super(rezultatDecorat);
    }

    @Override
    public void printareRezultat() {
        this.getRezultatAbstract().printareRezultat();
        System.out.println("Rezultat vizualizat online!");
    }
}
