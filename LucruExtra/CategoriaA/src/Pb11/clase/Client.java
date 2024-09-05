package Pb11.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata =new Cash();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizeazaPlata(double suma){
        modPlata.plateste(suma,this.nume);
    }
}
