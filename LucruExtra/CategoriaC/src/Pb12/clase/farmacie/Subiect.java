package Pb12.clase.farmacie;

import Pb12.clase.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer>observatori;

    public Subiect() {
        this.observatori=new ArrayList<>();
    }
    public void adaugareClient(Observer observer){
        this.observatori.add(observer);
    }

    public void stergereClient(Observer observer){
        this.observatori.remove(observer);
    }

    protected void notificareClienti(String mesaj){
        for(Observer observer:this.observatori){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificareReducerePreturi();

}
