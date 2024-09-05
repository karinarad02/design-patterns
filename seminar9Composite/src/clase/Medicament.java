package clase;

public class Medicament implements StructuraAbstracta{
    String numeMedicament;
    Double pret;

    public Medicament(String numeMedicament, Double pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public Double getPret() {
        return pret;
    }

    @Override
    public void adaugareCategorie(StructuraAbstracta se) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereCategorie(StructuraAbstracta se) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare+"Medicamentul cu numele "+this.numeMedicament+" are pretul "+this.pret);
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        this.pret=this.pret*(1-procentDiscount);
    }
}
