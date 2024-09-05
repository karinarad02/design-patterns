package Pb7.clase;

public class Facade {
    Persoana persoana;

    public Facade(Persoana persoana) {
        this.persoana = persoana;
    }

    public void verificaPeroana(){
        this.persoana.verificaVarsta();
        this.persoana.verificaUrmarire();
        this.persoana.verificaCreante();
    }
}
