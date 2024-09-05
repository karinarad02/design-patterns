package Pb2.clase;

public class RezervareBuilder implements IBuilder{
    private String numeClient;
    private boolean areAsezareGeam;
    private  boolean areScauneErgonomice;
    private  boolean areDecorareaMesei;
    private  boolean areMuzicaAmbientalaPersonalizata;
    private  boolean areGenMuzica;

    public RezervareBuilder(String nume) {
        this.numeClient = nume;
        this.areAsezareGeam = false;
        this.areScauneErgonomice = false;
        this.areDecorareaMesei = false;
        this.areMuzicaAmbientalaPersonalizata = false;
        this.areGenMuzica = false;
    }


    @Override
    public IBuilder adaugaAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam=areAsezareGeam;
        return this;
    }

    @Override
    public IBuilder adaugaScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice=areScauneErgonomice;
        return this;
    }

    @Override
    public IBuilder adaugaDecorareaMesei(boolean areDecorareaMesei) {
        this.areDecorareaMesei=areDecorareaMesei;
        return this;
    }

    @Override
    public IBuilder adaugaMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata=areMuzicaAmbientalaPersonalizata;
        return this;
    }

    @Override
    public IBuilder adaugaGenMuzica(boolean areGenMuzica) {
        this.areGenMuzica=areGenMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(numeClient,areAsezareGeam,areScauneErgonomice,areDecorareaMesei,areMuzicaAmbientalaPersonalizata,areGenMuzica);
    }
}
