package Pb11.clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println("Clientul "+nume+" are de platit "+suma+" cash");
    }
}
