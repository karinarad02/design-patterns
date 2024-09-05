package Pb5.softVechi;

public class Credit {
    private String numeClient;
    private double dobanda;

    public Credit(String numeClient, double dobanda) {
        this.numeClient = numeClient;
        this.dobanda = dobanda;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public double getDobanda() {
        return dobanda;
    }

    public void acordaCredit(){
        System.out.println(this.numeClient+" a primit un credit cu dobanda "+this.dobanda);
    }
}
