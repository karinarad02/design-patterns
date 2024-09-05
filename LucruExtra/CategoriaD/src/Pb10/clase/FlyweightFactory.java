package Pb10.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String,Flyweight>clienti;

    public FlyweightFactory() {
        this.clienti=new HashMap<>();
    }

    public Flyweight getClient(String numarCont,String nume,String adresa,String telefon,String email,double suma){
        if(!clienti.containsKey(numarCont)){
            clienti.put(numarCont,new Detinator(nume,adresa,telefon,email,numarCont,suma));
        }
        return clienti.get(numarCont);
    }
}
