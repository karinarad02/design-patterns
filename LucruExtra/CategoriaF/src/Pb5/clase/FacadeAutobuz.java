package Pb5.clase;

public class FacadeAutobuz {
    Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void elibereazaUsi(){
        autobuz.elibereazaUsaFata();
        autobuz.elibereazaUsaMijloc();
        autobuz.elibereazaUsaSpate();
    }
    public void elibereazaFortatUsi(){
        autobuz.eliberareFortataUsaFata();
        autobuz.eliberareFortataUsaMijloc();
        autobuz.eliberareFortataUsaSpate();
    }
}
