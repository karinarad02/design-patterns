package Pb9.clase;

public interface StructuraAbstracta {
    public void adaugaSucursala(StructuraAbstracta sa);
    public void stergeSucursala(StructuraAbstracta sa);
    public StructuraAbstracta getSucursala(int index);
    public void afisareIerarhie(String indentare);

}
