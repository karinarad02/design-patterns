package dubluri;

import model.IPersoana;

public class FakePersoana implements IPersoana {
    String getSex;
    int getVarsta;
    boolean getCNP;

    public void setGetSex(String getSex) {
        this.getSex = getSex;
    }

    public void setGetVarsta(int getVarsta) {
        this.getVarsta = getVarsta;
    }

    public void setGetCNP(boolean getCNP) {
        this.getCNP = getCNP;
    }

    @Override
    public String getSex() {
        return getSex;
    }

    @Override
    public int getVarsta() {
        return getVarsta;
    }

    @Override
    public boolean checkCNP() {
        return getCNP;
    }
}
