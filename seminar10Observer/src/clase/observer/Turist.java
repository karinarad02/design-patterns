package clase.observer;

public class Turist implements Observer{
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Turistul a primit mesajul "+mesaj);
    }
}
