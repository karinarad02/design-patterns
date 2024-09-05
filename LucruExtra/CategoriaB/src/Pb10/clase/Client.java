package Pb10.clase;

public class Client implements Flyweight{
    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public void realizeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" cu numarul "+this.telefon+" si emailul "+this.email+" face rezervarea "+rezervare.toString());
    }
}
