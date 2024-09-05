package Pb16.clase;

public class Card extends ModPlata{
    private double sold;

    public Card(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double suma, String nume) {
        if(suma<=sold) {
            System.out.println("Clientul " + nume + " are de platit " + suma + " lei cu cardul!");
            this.sold-=suma;
        }else{
            super.succesor.plateste(suma,nume);
        }
    }
}
