package Pb10.clase;

public class Banca {
    private String nume;
    private String sucursala;
    private double capital;

    public Banca(String nume, String sucursala, double capital) {
        this.nume = nume;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    public String getNume() {
        return nume;
    }

    public String getSucursala() {
        return sucursala;
    }

    public double getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banca{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append(", capital=").append(capital);
        sb.append('}');
        return sb.toString();
    }
}
