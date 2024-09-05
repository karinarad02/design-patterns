package Pb3.clase;

public class Rezervare {
    private String numeClient;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaInclusa;
    private  boolean areMuzicaAmbientala;
    private boolean areGenMuzica;

    public Rezervare(String numeClient, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaInclusa, boolean areMuzicaAmbientala, boolean areGenMuzica) {
        this.numeClient = numeClient;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areGenMuzica = areGenMuzica;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public boolean isAreMancareInclusa() {
        return areMancareInclusa;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public boolean isAreBauturaInclusa() {
        return areBauturaInclusa;
    }

    public void setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
    }

    public boolean isAreMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public boolean isAreGenMuzica() {
        return areGenMuzica;
    }

    public void setAreGenMuzica(boolean areGenMuzica) {
        this.areGenMuzica = areGenMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaInclusa=").append(areBauturaInclusa);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", areGenMuzica=").append(areGenMuzica);
        sb.append('}');
        return sb.toString();
    }
}
