package Pb16.clase;

public class Cash extends ModPlata{
    private double sumaBani;

    public Cash(double sumaBani) {
        this.sumaBani = sumaBani;
    }

    @Override
    public void plateste(double suma, String nume) {
        if(suma<=sumaBani) {
            System.out.println("Clientul " + nume + " are de platit " + suma + " lei in cash!");
            this.sumaBani-=suma;
        }else{
            super.succesor.plateste(suma,nume);
        }
    }
}
