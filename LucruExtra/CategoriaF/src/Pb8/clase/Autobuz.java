package Pb8.clase;

public class Autobuz implements InterfataAutobuz{
    private String sofer;
    private int nrUsi;
    private int numarPasageri;

    public Autobuz(String sofer, int nrUsi, int numarPasageri) {
        this.sofer = sofer;
        this.nrUsi = nrUsi;
        this.numarPasageri = numarPasageri;
    }

    public String getSofer() {
        return sofer;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public int getNumarPasageri() {
        return numarPasageri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("sofer='").append(sofer).append('\'');
        sb.append(", nrUsi=").append(nrUsi);
        sb.append(", numarPasageri=").append(numarPasageri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void oprireInStatie(Client client) {
        System.out.println("Autobuzul opreste in statie pentru "+client.getNumeClient());
    }
}
