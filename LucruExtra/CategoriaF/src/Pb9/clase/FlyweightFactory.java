package Pb9.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer,Flyweight>linii;

    public FlyweightFactory() {
        this.linii=new HashMap<>();
    }

    public Flyweight getLinie(int numar,String prima,String ultima){
        if(!linii.containsKey(numar)){
            linii.put(numar,new Linie(numar,prima,ultima));
        }
        return this.linii.get(numar);
    }
}
