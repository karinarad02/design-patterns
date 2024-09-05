package Pb12.clase.observer;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume+" a primit notificarea "+mesaj);
    }
}
