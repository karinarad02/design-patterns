package Pb12.clase.spital;

import Pb12.clase.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer>observatori;

    public Subiect() {
        this.observatori=new ArrayList<>();
    }
    public void adaugarePacient(Observer observer){
        this.observatori.add(observer);
    }

    public void stergerePacient(Observer observer){
        this.observatori.remove(observer);
    }

    protected void notificaObservatori(String mesaj){
        for(Observer observer:this.observatori){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificareEpidemie();

}
