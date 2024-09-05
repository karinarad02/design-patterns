package Pb6.clase;

public abstract class CardAbstract {
    private String numar;
    private String detinator;
    private double suma;

    public CardAbstract(String numar, String detinator, double suma) {
        this.numar = numar;
        this.detinator = detinator;
        this.suma = suma;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getDetinator() {
        return detinator;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CardAbstract{");
        sb.append("numar='").append(numar).append('\'');
        sb.append(", detinator='").append(detinator).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }

    public abstract void plata();
}
