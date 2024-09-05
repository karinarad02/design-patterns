package Pb14.clase;

public abstract class Intrare {
    public abstract void asezareCoada();
    public abstract void prezintaBilet();
    public abstract void controlCorporal();
    public abstract void intrareStadion();
    public abstract void ocupareLoc();

    public final void intrarePeStadion(){
        asezareCoada();
        prezintaBilet();
        controlCorporal();
        intrareStadion();
        ocupareLoc();
    }
}
