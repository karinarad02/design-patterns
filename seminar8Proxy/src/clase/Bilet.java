package clase;

public class Bilet implements BiletAbstract{
    private String echipaGazda;
    private String echipaOaspete;
    private double pret;

    public Bilet(String echipaGazda, String echipaOaspete, double pret) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.pret = pret;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public void vanzareBilet(Client client) {
        System.out.println(client.getNumeClient()+" a cumparat biletul la meciul dintre "+this.echipaGazda+" si "+this.echipaOaspete);
    }
}
