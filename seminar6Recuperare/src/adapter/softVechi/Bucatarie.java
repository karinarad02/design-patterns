package adapter.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie{
    List<Produs>listaProduse;

    public Bucatarie() {
        this.listaProduse =new ArrayList<>();
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }
    @Override
    public void adaugareProdus(Produs produs){
        listaProduse.add(produs);
    }
    @Override
    public void printareBon() {
        float suma=0;
        System.out.println("Lista de produse: ");
        for(Produs produs:listaProduse){
            System.out.println(produs);
            suma+= produs.getPret();
        }
        System.out.println("Total: "+suma);
    }
}
