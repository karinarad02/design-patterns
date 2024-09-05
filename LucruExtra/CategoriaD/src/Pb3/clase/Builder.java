package Pb3.clase;

public class Builder implements IBuilder{
    private boolean primesteSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    public Builder() {
        this.primesteSalariu=false;
        this.areCardAtasat = false;
        this.areInternetBanking = false;
    }

    public Builder(boolean primesteSalariu, boolean areCardAtasat, boolean areInternetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public IBuilder adaugaSalariu(boolean primesteSalariu) {
        this.primesteSalariu=primesteSalariu;
        return this;
    }

    @Override
    public IBuilder adaugaCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat=areCardAtasat;
        return this;
    }

    @Override
    public IBuilder adaugaInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking=areInternetBanking;
        return this;
    }

    @Override
    public Cont build() {
        return new Cont(primesteSalariu,areCardAtasat,areInternetBanking);
    }
}
