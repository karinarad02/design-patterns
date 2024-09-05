package model.zoo;

import model.animal.Vietate;
import model.animal.ZooKeeper;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String nume;
    private ZooKeeper ingrijitor;
    private Map<Vietate, String> animale;

    public Zoo(String nume, ZooKeeper ingrijitor, Map<Vietate, String> animale) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = animale;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ZooKeeper getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(ZooKeeper ingrijitor) {
        this.ingrijitor = ingrijitor;
    }

    public Map<Vietate, String> getAnimale() {
        return animale;
    }

    public void setAnimale(Map<Vietate, String> animale) {
        this.animale = animale;
    }

    public void adaugaAnimal(Vietate vietate,String mancare)
    {
        if(this.animale==null) {
            this.animale = new HashMap<>();
        }
        if(vietate!=null && mancare.length()>2) {
            this.animale.put(vietate, mancare);
        }
    }

    public void hranesteToateAnimalele() {
        for (Vietate vietate : animale.keySet()) {
            ingrijitor.hranesteMamifer(vietate, animale.get(vietate));

        }

    }


}