package Pb9.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements StructuraAbstracta{
    private String denumire;
    List<StructuraAbstracta>agentii;

    public Sucursala(String denumire) {
        this.denumire = denumire;
        this.agentii=new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adaugaSucursala(StructuraAbstracta sa) {
        this.agentii.add(sa);
    }

    @Override
    public void stergeSucursala(StructuraAbstracta sa) {
        this.agentii.remove(sa);
    }

    @Override
    public StructuraAbstracta getSucursala(int index) {
        if(index>=0&&index<this.agentii.size()){
            return this.agentii.get(index);
        }else{
            return null;
        }
    }

    @Override
    public void afisareIerarhie(String indentare) {
        System.out.println(indentare+"Sucursala "+this.denumire+" are agentiile ");
        for(StructuraAbstracta sa:agentii){
            sa.afisareIerarhie(indentare+"   ");
        }
    }
}
