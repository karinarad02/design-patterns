package Pb3.clase;

public class Cont {
    private boolean primesteSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    protected Cont() {
    }

    protected Cont(boolean primesteSalariu, boolean areCardAtasat, boolean areInternetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    protected void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    protected void setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
    }

    protected void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("primesteSalariu=").append(primesteSalariu);
        sb.append(", areCardAtasat=").append(areCardAtasat);
        sb.append(", areInternetBanking=").append(areInternetBanking);
        sb.append('}');
        return sb.toString();
    }
}
