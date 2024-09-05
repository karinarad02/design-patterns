package Pb11.clase.observer;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primireNotificare(String mesaj) {
        System.out.println(this.nume+" a primit notificarea "+mesaj);
    }
}
