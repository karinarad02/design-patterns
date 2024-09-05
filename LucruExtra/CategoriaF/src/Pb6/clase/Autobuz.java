package Pb6.clase;

public class Autobuz implements StructuraAbstracta{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public String getProducator() {
        return producator;
    }

    public String getModel() {
        return model;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adaugareFlota(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereFlota(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getFlota(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaIerarhie(String indentare) {
        System.out.println(indentare+this.toString());
    }
}
