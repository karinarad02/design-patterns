package Pb7.decoratoare;

import Pb7.clase.Rezultat;
import Pb7.clase.RezultatAbstract;

public abstract class DecoratorRezultat extends RezultatAbstract{
    private RezultatAbstract rezultatAbstract;

    public DecoratorRezultat(String cod, String numePacient, String diagnostic, double sumaPlata) {
        super(cod, numePacient, diagnostic, sumaPlata);
        this.rezultatAbstract=new Rezultat(cod,numePacient,diagnostic,sumaPlata);
    }

    public DecoratorRezultat(RezultatAbstract rezultatDecorat) {
        super(rezultatDecorat.getCod(), rezultatDecorat.getNumePacient(), rezultatDecorat.getDiagnostic(),rezultatDecorat.getSumaPlata());
        this.rezultatAbstract=rezultatDecorat;
    }

    public RezultatAbstract getRezultatAbstract() {
        return rezultatAbstract;
    }
}
