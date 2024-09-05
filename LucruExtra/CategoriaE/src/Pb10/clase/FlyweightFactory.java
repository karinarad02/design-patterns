package Pb10.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Client> listaClienti;

    public FlyweightFactory() {
        this.listaClienti=new HashMap<>();
    }

    public Flyweight getClient(String nume,int varsta,int inaltime,int latime, String culoareTricou){
        if(!this.listaClienti.containsKey(nume)){
            this.listaClienti.put(nume,new Client(nume,varsta,inaltime,latime,culoareTricou));
        }
        return this.listaClienti.get(nume);
    }
}
