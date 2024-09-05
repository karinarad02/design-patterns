package Pb10.clase;

public class Client implements Flyweight{
    private String nume;
    private int varsta;
    private int inaltime;
    private int latime;
    private String culoareTricou;

    public Client(String nume, int varsta, int inaltime, int latime, String culoareTricou) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.latime = latime;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public void desenarePersoana(Loc loc) {
        System.out.println("Clientul "+this.nume+" de dimensiuni "+this.inaltime+" x "+this.latime+" poarta un tricou "+this.culoareTricou+" si sta pe locul "+loc.toString());
    }
}
