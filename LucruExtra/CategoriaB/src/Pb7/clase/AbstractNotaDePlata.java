package Pb7.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNotaDePlata {
    private String numeRestaurant;
    private double valoare;
    private List<Produs>produse;

    public AbstractNotaDePlata(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.valoare = 0.0;
        this.produse=new ArrayList<>();
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public double getValoare() {
        return valoare;
    }

    public List<Produs> getProduse() {
        return produse;
    }

    public void adaugareProdus(Produs produs){
        this.produse.add(produs);
    }
    public void calculeazaTotal(){
        double suma=0.0;
        for(Produs produs:produse){
            suma+=produs.getPret();
        }
        this.valoare=suma;
    }
    public abstract void printareNota();
}
