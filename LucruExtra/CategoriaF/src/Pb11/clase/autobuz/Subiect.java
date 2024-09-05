package Pb11.clase.autobuz;

import Pb11.clase.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer>observatori;

    public Subiect() {
        this.observatori=new ArrayList<>();
    }

    public void adaugareCalatori(Observer observer){
        this.observatori.add(observer);
    }

    public void stergereCalatori(Observer observer){
        this.observatori.remove(observer);
    }

    protected void notificareClatori(String mesaj){
        for (Observer observer:observatori){
            observer.primireNotificare(mesaj);
        }
    }

    public abstract void notificarePlecareAutobuz();
}
