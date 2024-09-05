package Pb9.clase;

public class Linie implements Flyweight{
    private int numar;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int numar, String primaStatie, String ultimaStatie) {
        this.numar = numar;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afisareAutobuz(AutobuzLinie autobuzLinie) {
        System.out.println("Pe linia "+this.numar+" circula autobuzul "+autobuzLinie.toString()+" de la "+this.primaStatie+" pana la "+this.ultimaStatie);
    }
}
