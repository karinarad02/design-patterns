package Pb7.decoratoare;

import Pb7.clase.RezultatAbstract;

public class RezultatPrintat extends DecoratorRezultat{
    public RezultatPrintat(String cod, String numePacient, String diagnostic, double sumaPlata) {
        super(cod, numePacient, diagnostic, sumaPlata);
    }

    public RezultatPrintat(RezultatAbstract rezultatDecorat) {
        super(rezultatDecorat);
    }

    @Override
    public void printareRezultat() {
        this.getRezultatAbstract().printareRezultat();
        System.out.println("Rezultat printat!");
    }
}
