package Pb11.clase;

public class Client {
    private String nume;
    private TipClient tipClient;

    public Client(String nume) {
        this.nume = nume;
        this.tipClient=new PersoanaFizica();
    }

    public void setTipClient(TipClient tipClient) {
        this.tipClient = tipClient;
    }

    public void verficareActe(){
        this.tipClient.verificareActe(this.nume);
    }
}
