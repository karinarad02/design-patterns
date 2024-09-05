package Pb10.clase;

public class Loc {
    private String sectiune;
    private int rand;
    private int numarLoc;

    public Loc(String sectiune, int rand, int numarLoc) {
        this.sectiune = sectiune;
        this.rand = rand;
        this.numarLoc = numarLoc;
    }

    public String getSectiune() {
        return sectiune;
    }

    public int getRand() {
        return rand;
    }

    public int getNumarLoc() {
        return numarLoc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Loc{");
        sb.append("sectiune='").append(sectiune).append('\'');
        sb.append(", rand=").append(rand);
        sb.append(", numarLoc=").append(numarLoc);
        sb.append('}');
        return sb.toString();
    }
}
