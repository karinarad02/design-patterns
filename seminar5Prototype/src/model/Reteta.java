package model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta{
    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;
    private Double gramajMedicament;

    private Reteta() {
    }

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramajMedicament) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramajMedicament = gramajMedicament;
        Double suma=0.0;
        for(Double cantitate:compozitieMedicament.values()){
            suma+=cantitate;
        }
        if(suma>gramajMedicament+1.0||suma<gramajMedicament-1.0){
            throw new RuntimeException("Gramaj incorect");
        }
    }

    @Override
    public AbstractReteta cloneaza() {
        Reteta reteta=new Reteta();
        reteta.numeMedicament=this.numeMedicament;
        reteta.compozitieMedicament=new HashMap<>();
        for(String cheie:this.compozitieMedicament.keySet()){
            reteta.compozitieMedicament.put(cheie,this.compozitieMedicament.get(cheie));
        }
        reteta.gramajMedicament=this.gramajMedicament;
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", compozitieMedicament=" + compozitieMedicament +
                ", gramajMedicament=" + gramajMedicament +
                '}';
    }
}
