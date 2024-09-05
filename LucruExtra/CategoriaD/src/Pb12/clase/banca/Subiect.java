package Pb12.clase.banca;

import Pb12.clase.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer>listaObservatori;

    public Subiect() {
        this.listaObservatori=new ArrayList<>();
    }
    public void adaugaObservator(Observer observer){
        this.listaObservatori.add(observer);
    }
    public void stergeObservator(Observer observer){
        this.listaObservatori.remove(observer);
    }

    protected void notificaObservatori(String mesaj){
        for(Observer observer:listaObservatori){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificareDobandaMica();
}
