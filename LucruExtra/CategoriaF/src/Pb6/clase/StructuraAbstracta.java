package Pb6.clase;

public interface StructuraAbstracta {
    public void adaugareFlota(StructuraAbstracta sa);
    public void stergereFlota(StructuraAbstracta sa);
    public StructuraAbstracta getFlota(int index);
    public void afiseazaIerarhie(String indentare);
}
