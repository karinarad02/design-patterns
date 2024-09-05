package Pb11.clase;

public class PersoanaFizica implements TipClient{
    @Override
    public void verificareActe(String nume) {
        System.out.println(nume+" are de adus buletinul și adeverință de la munca");
    }
}
