package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta{
    List<StructuraAbstracta>medicamente;
    String denumire;

    public Categorie(String denumire) {
        this.denumire = denumire;
        this.medicamente=new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }


    @Override
    public void adaugareCategorie(StructuraAbstracta se) {
        this.medicamente.add(se);
    }

    @Override
    public void stergereCategorie(StructuraAbstracta se) {
        this.medicamente.remove(se);
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        if(index>=0&&index<medicamente.size()){
            return this.medicamente.get(index);
        }else{
            return null;
        }
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare+"Categoria "+this.denumire+" are urmatoarele subcategorii ");
        for(StructuraAbstracta sa:medicamente){
            sa.afisareProspect(indentare+"    ");
        }
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        for(StructuraAbstracta sa:medicamente){
            sa.calculeazaPret(procentDiscount);
        }
    }
}
