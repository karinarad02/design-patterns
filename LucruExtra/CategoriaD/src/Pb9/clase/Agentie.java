package Pb9.clase;

public class Agentie implements StructuraAbstracta{
    private String denumire;

    public Agentie(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adaugaSucursala(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeSucursala(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getSucursala(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareIerarhie(String indentare) {
        System.out.println(indentare+"Agentia "+this.denumire);
    }
}
