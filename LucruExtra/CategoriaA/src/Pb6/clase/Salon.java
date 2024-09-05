package Pb6.clase;

public class Salon {
    private int numar;
    private boolean disponibilitate;

    public Salon(int numar, boolean disponibilitate) {
        this.numar = numar;
        this.disponibilitate = disponibilitate;
    }

    public void disponibilitatePat(){
        if(disponibilitate){
            System.out.println("Patul este disponibil");
        }else{
            System.out.println("Patul NU este disponibil");
        }
    }
}
