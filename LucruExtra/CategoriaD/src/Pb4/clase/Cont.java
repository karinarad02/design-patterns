package Pb4.clase;

public class Cont implements ICont{
    private String numeBanca;
    private String numeClient;
    private String numarBuletin;
    private String numarCard;

    private Cont() {
    }

    public Cont(String numeBanca, String numeClient, String numarBuletin, String numarCard) {
        this.numeBanca = numeBanca;
        this.numeClient = numeClient;
        if(numarBuletin.length()==13) {
            this.numarBuletin = numarBuletin;
        }else{
            throw new RuntimeException("Buletinul are 13 cifre");
        }
        if(numarCard.length()==16) {
            this.numarCard = numarCard;
        }else{
            throw new RuntimeException("Cardul are 16 cifre");

        }
    }

    public void setNumeBanca(String numeBanca) {
        this.numeBanca = numeBanca;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNumarBuletin(String numarBuletin) {
        this.numarBuletin = numarBuletin;
    }

    public void setNumarCard(String numarCard) {
        this.numarCard = numarCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", numarBuletin='").append(numarBuletin).append('\'');
        sb.append(", numarCard='").append(numarCard).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ICont clone() {
        Cont cont=new Cont();
        cont.numeBanca=this.numeBanca;
        cont.numeClient=this.numeClient;
        cont.numarBuletin=this.numarBuletin;
        cont.numarCard=this.numarCard;
        return cont;
    }
}
