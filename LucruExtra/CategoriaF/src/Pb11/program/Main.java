package Pb11.program;

import Pb11.clase.autobuz.Autobuz;
import Pb11.clase.autobuz.Subiect;
import Pb11.clase.observer.Calator;
import Pb11.clase.observer.Observer;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz=new Autobuz(335);
        Observer calator1=new Calator("Robert");
        Observer calator2=new Calator("Andrei");
        Observer calator3=new Calator("Bogdan");
        Observer calator4=new Calator("Alex");
        autobuz.adaugareCalatori(calator1);
        autobuz.adaugareCalatori(calator2);
        autobuz.adaugareCalatori(calator3);
        autobuz.adaugareCalatori(calator4);
        autobuz.notificarePlecareAutobuz();

    }
}
