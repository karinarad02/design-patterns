package Pb9.clase;

public class Loc implements SectiuneAbstracta{
    private int numar;
    private boolean ocupat;

    public Loc(int numar, boolean ocupat) {
        this.numar = numar;
        this.ocupat = ocupat;
    }

    public int getNumar() {
        return numar;
    }

    public boolean isOcupat() {
        return ocupat;
    }


    @Override
    public void adaugareSectiune(SectiuneAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereSectiune(SectiuneAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SectiuneAbstracta getSectiune(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareLocuri(String indentare) {
        System.out.println(indentare+"Locul "+this.getNumar()+" ocupare: "+this.isOcupat());
    }
}
