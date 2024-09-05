package Pb9.clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(Client client) {
        if(this.rezervare.getNrPersoane()>=4){
            this.rezervare.realizeazaRezervare(client);
        }else{
            System.out.println("Nu se poate face rezervare decat pentru minim 4 persoane!");
        }
    }
}
