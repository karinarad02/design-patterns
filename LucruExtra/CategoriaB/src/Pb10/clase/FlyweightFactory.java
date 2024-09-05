package Pb10.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String,Client>listaClienti;

    public FlyweightFactory() {
        this.listaClienti=new HashMap<>();
    }

    public Flyweight getClient(String email,String nume,String telefon){
        if(!listaClienti.containsKey(email)){
            listaClienti.put(email,new Client(nume,telefon,email));
        }
        return listaClienti.get(email);
    }
}
