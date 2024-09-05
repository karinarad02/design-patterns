package Pb8.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements StructuraAbstracta{
    List<StructuraAbstracta>produse;
    String denumire;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.produse=new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adaugareSectiune(StructuraAbstracta sa) {
        this.produse.add(sa);
    }

    @Override
    public void stergereSectiune(StructuraAbstracta sa) {
        this.produse.remove(sa);
    }

    @Override
    public StructuraAbstracta getSectiune(int index) {
        if(index>=0&&index<this.produse.size()){
            return this.produse.get(index);
        }else{
            return null;
        }
    }

    @Override
    public void afisareMeniu(String indentare) {
        System.out.println(indentare+"Sectiunea "+this.getDenumire()+" are urmatoarele subsectiuni:");
        for(StructuraAbstracta sa:produse){
            sa.afisareMeniu(indentare+indentare);
        }
    }
}
