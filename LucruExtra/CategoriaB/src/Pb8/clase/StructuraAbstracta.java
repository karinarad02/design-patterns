package Pb8.clase;

public interface StructuraAbstracta {
    public void adaugareSectiune(StructuraAbstracta sa);
    public void stergereSectiune(StructuraAbstracta sa);
    public StructuraAbstracta getSectiune(int index);
    public void afisareMeniu(String indentare);
}
