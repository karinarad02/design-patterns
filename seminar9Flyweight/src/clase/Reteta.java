package clase;

public class Reteta {
    private String numeReteta;
    private int suma;
    private int nrMedicamente;

    public Reteta(String numeReteta, int suma, int nrMedicamente) {
        this.numeReteta = numeReteta;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public int getSuma() {
        return suma;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeReteta='" + numeReteta + '\'' +
                ", suma=" + suma +
                ", nrMedicamente=" + nrMedicamente +
                '}';
    }
}
