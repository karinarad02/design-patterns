package Pb14.clase;

public class Bilet {
    private String nume;
    private int loc;

    public Bilet(String nume, int loc) {
        this.nume = nume;
        this.loc = loc;
    }

    public String getNume() {
        return nume;
    }

    public int getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", loc=").append(loc);
        sb.append('}');
        return sb.toString();
    }
}
