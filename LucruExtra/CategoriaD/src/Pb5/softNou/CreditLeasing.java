package Pb5.softNou;

public class CreditLeasing {
    private String numeClient;
    private String numarInmatriculare;

    public CreditLeasing(String numeClient, String numarInmatriculare) {
        this.numeClient = numeClient;
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public void ofetaLeasing(){
        System.out.println(this.numeClient+" a primit un credit de leasing pentru masina cu numarul de inmatriculare "+this.numarInmatriculare);
    }
}
