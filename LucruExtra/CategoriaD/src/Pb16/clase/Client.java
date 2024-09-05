package Pb16.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata=new Card(35);
        ModPlata cash=new Cash(50);
        ModPlata invalid=new PlataInvalida();
        this.modPlata.setSuccesor(cash);
        cash.setSuccesor(invalid);
    }

    public void realizeazaPlata(double suma){
        this.modPlata.plateste(suma,this.nume);
    }
}
