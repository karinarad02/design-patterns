package Pb9.main;

import Pb9.clase.AutobuzLinie;
import Pb9.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        AutobuzLinie autobuz1=new AutobuzLinie("Mercedes",2000,20);
        AutobuzLinie autobuz2=new AutobuzLinie("Mercedes",2010,25);
        flyweightFactory.getLinie(1,"Gara Centrală","Piața Victoriei").afisareAutobuz(autobuz1);
        flyweightFactory.getLinie(1,"Parcul Tineretului","Aeroportul Internațional").afisareAutobuz(autobuz2);

    }
}
