package Pb7.clase;

public class Rezultat extends RezultatAbstract{
    public Rezultat(String cod, String numePacient, String diagnostic, double sumaPlata) {
        super(cod, numePacient, diagnostic, sumaPlata);
    }

    @Override
    public void printareRezultat() {
        System.out.println(this.toString());
    }
}
