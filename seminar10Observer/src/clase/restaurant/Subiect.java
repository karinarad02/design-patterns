package clase.restaurant;

import clase.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer>listaObserveri;

    public Subiect() {
        this.listaObserveri = new ArrayList<>();
    }

    public void adaugareClient(Observer observer){
        listaObserveri.add(observer);
    }
    public void stergereClient(Observer observer){
        listaObserveri.remove(observer);
    }

    protected void notificaObservatori(String mesaj){
        for(Observer observer:listaObserveri){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificareMeniuNou();
    public abstract void  notificareOfertaPret();
    public abstract void notificareEveniment(String data);
}
