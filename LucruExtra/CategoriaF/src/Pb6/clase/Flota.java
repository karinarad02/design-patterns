package Pb6.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements StructuraAbstracta{
    private String denumire;
    List<StructuraAbstracta>autobuze;

    public Flota(String denumire) {
        this.denumire = denumire;
        this.autobuze=new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }

    public List<StructuraAbstracta> getAutobuze() {
        return autobuze;
    }

    @Override
    public void adaugareFlota(StructuraAbstracta sa) {
        this.autobuze.add(sa);
    }

    @Override
    public void stergereFlota(StructuraAbstracta sa) {
        this.autobuze.remove(sa);
    }

    @Override
    public StructuraAbstracta getFlota(int index) {
        if(index>=0&&index<this.autobuze.size()){
            return this.autobuze.get(index);
        }
        return null;
    }

    @Override
    public void afiseazaIerarhie(String indentare) {
        System.out.println(indentare+"Flota "+this.denumire+" are autobuzele ");
        for(StructuraAbstracta sa:autobuze){
            sa.afiseazaIerarhie(indentare+"  ");
        }
    }
}
