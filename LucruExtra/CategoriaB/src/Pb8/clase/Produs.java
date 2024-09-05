package Pb8.clase;

public class Produs implements StructuraAbstracta{
    private String denumireProdus;
    Double pret;

    public Produs(String denumireProdus, Double pret) {
        this.denumireProdus = denumireProdus;
        this.pret = pret;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public Double getPret() {
        return pret;
    }

    @Override
    public void adaugareSectiune(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereSectiune(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getSectiune(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareMeniu(String indentare) {
        System.out.println(indentare+this.getDenumireProdus()+" costa "+this.getPret());
    }
}
