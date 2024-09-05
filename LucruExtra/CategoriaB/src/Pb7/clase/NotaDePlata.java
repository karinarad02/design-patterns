package Pb7.clase;

public class NotaDePlata extends AbstractNotaDePlata{
    public NotaDePlata(String numeRestaurant) {
        super(numeRestaurant);
    }

    @Override
    public void printareNota() {
        this.calculeazaTotal();
        System.out.println("De la restaurantul: "+super.getNumeRestaurant()+"\nAti comandat produsele: ");
        for(Produs produs:this.getProduse()){
            System.out.println(produs);
        }
        System.out.println("Total: "+this.getValoare());
    }
}
