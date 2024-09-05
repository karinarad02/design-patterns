package Pb9.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements SectiuneAbstracta{
    private List<SectiuneAbstracta> locuri;
    private String denumire;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.locuri=new ArrayList<>();
    }

    @Override
    public void adaugareSectiune(SectiuneAbstracta sa) {
        this.locuri.add(sa);
    }

    @Override
    public void stergereSectiune(SectiuneAbstracta sa) {
        this.locuri.remove(sa);
    }

    @Override
    public SectiuneAbstracta getSectiune(int index) {
        if(index>=0&&index<this.locuri.size()){
            return this.locuri.get(index);
        }else{
            return null;
        }
    }

    @Override
    public void afisareLocuri(String indentare) {
        System.out.println(indentare+"Sectiunea "+this.denumire+" are subsectiunile: ");
        for(SectiuneAbstracta loc:locuri){
            loc.afisareLocuri(indentare+indentare);
        }
    }
}
