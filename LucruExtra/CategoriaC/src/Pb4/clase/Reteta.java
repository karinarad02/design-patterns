package Pb4.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;
    private double gramajMedicament;

    private Reteta() {
    }

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, double gramajMedicament) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramajMedicament = gramajMedicament;
        //verificare suma cantitati=gramaj
        Double suma=0.0;
        for(Double cantitate: compozitieMedicament.values()){
            suma+=cantitate;
        }
        if(suma!=gramajMedicament){
            throw new RuntimeException("Gramaj gresit");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compozitieMedicament=").append(compozitieMedicament);
        sb.append(", gramajMedicament=").append(gramajMedicament);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IReteta clone() {
        Reteta reteta=new Reteta();
        reteta.numeMedicament=this.numeMedicament;
        reteta.gramajMedicament=this.gramajMedicament;
        reteta.compozitieMedicament=new HashMap<>();
        for(String cheie:this.compozitieMedicament.keySet()){
            reteta.compozitieMedicament.put(cheie,this.compozitieMedicament.get(cheie));
        }
        return reteta;
    }
}
