package Pb11.clase;

public class Card implements ModPlata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println("Clientul "+nume+" are de platit "+suma+" cu cardul");
    }
}
