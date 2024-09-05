package clase;

public class Card extends ModPlata{
    private int sold;

    public Card(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(sold>=suma){
            System.out.println(nume+" are de platit "+suma+" cu cardul");
            this.sold=sold-suma;
        }else{
            super.succesor.plateste(suma,nume);
        }
    }
}
