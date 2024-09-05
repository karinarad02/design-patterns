package Pb8.clase;

public class Credit implements InterfataCredit{
    private double suma;
    private double dobanda;
    private String moneda;

    public Credit( double suma, double dobanda, String moneda) {
        this.suma = suma;
        this.dobanda = dobanda;
        this.moneda = moneda;
    }

    public double getSuma() {
        return suma;
    }

    public double getDobanda() {
        return dobanda;
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public void creareCont(Client client) {
        System.out.println(client.getNume()+" are un cont cu suma "+this.suma+" "+this.moneda+" si dobanda de "+this.dobanda);
    }
}
