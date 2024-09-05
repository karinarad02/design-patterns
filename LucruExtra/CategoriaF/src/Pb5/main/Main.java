package Pb5.main;

import Pb5.clase.Autobuz;
import Pb5.clase.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        System.out.println("Fara Facade:");
        autobuz.elibereazaUsaFata();
        autobuz.elibereazaUsaMijloc();
        autobuz.elibereazaUsaSpate();
        autobuz.eliberareFortataUsaFata();
        autobuz.eliberareFortataUsaMijloc();
        autobuz.eliberareFortataUsaSpate();
        System.out.println("Cu Facade:");
        FacadeAutobuz facadeAutobuz=new FacadeAutobuz(autobuz);
        facadeAutobuz.elibereazaUsi();
        facadeAutobuz.elibereazaFortatUsi();
    }
}
