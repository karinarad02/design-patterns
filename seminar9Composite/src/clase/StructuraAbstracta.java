package clase;

public interface StructuraAbstracta {
    public void adaugareCategorie(StructuraAbstracta se);
    public void stergereCategorie(StructuraAbstracta se);
    public StructuraAbstracta getCategorie(int index);
    public void afisareProspect(String indentare);
    public void calculeazaPret(double procentDiscount);
}
