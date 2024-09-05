package Pb3.clase;

public class Builder implements IBuilder{
    private String numeClient;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaInclusa;
    private  boolean areMuzicaAmbientala;
    private boolean areGenMuzica;

    public Builder(String numeClient) {
        this.numeClient = numeClient;
    }

    protected Builder(String numeClient, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaInclusa, boolean areMuzicaAmbientala, boolean areGenMuzica) {
        this.numeClient = numeClient;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areGenMuzica = areGenMuzica;
    }

    @Override
    public IBuilder adaugaMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa=areMancareInclusa;
        return this;
    }

    @Override
    public IBuilder adaugaScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic=areScaunErgonomic;
        return this;
    }

    @Override
    public IBuilder adaugaBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa=areBauturaInclusa;
        return this;
    }

    @Override
    public IBuilder adaugaMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala=areMuzicaAmbientala;
        return this;
    }

    @Override
    public IBuilder adaugaGenMuzica(boolean areGenMuzica) {
        this.areGenMuzica=areGenMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(numeClient,areMancareInclusa,areScaunErgonomic,areBauturaInclusa,areMuzicaAmbientala,areGenMuzica);
    }
}
