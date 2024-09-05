package Pb2.clase;

public class Rezervare {
    private String numeClient;
    private boolean areAsezareGeam;
    private  boolean areScauneErgonomice;
    private  boolean areDecorareaMesei;
    private  boolean areMuzicaAmbientalaPersonalizata;
    private  boolean areGenMuzica;

    protected Rezervare() {
    }

    public Rezervare(String numeClient, boolean areAsezareGeam, boolean areScauneErgonomice, boolean areDecorareaMesei, boolean areMuzicaAmbientalaPersonalizata, boolean areGenMuzica) {
        this.numeClient = numeClient;
        this.areAsezareGeam = areAsezareGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areDecorareaMesei = areDecorareaMesei;
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        this.areGenMuzica = areGenMuzica;
    }

    public String getNumeClient() {
        return numeClient;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public boolean isAreAsezareGeam() {
        return areAsezareGeam;
    }

    protected void setAreAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam = areAsezareGeam;
    }

    public boolean isAreScauneErgonomice() {
        return areScauneErgonomice;
    }

    protected void setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
    }

    public boolean isAreDecorareaMesei() {
        return areDecorareaMesei;
    }

    protected void setAreDecorareaMesei(boolean areDecorareaMesei) {
        this.areDecorareaMesei = areDecorareaMesei;
    }

    public boolean isAreMuzicaAmbientalaPersonalizata() {
        return areMuzicaAmbientalaPersonalizata;
    }

    protected void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
    }

    public boolean isAreGenMuzica() {
        return areGenMuzica;
    }

    protected void setAreGenMuzica(boolean areGenMuzica) {
        this.areGenMuzica = areGenMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", areAsezareGeam=").append(areAsezareGeam);
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", areDecorareaMesei=").append(areDecorareaMesei);
        sb.append(", areMuzicaAmbientalaPersonalizata=").append(areMuzicaAmbientalaPersonalizata);
        sb.append(", areGenMuzica=").append(areGenMuzica);
        sb.append('}');
        return sb.toString();
    }
}
