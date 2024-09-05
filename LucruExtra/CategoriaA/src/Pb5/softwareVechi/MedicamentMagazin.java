package Pb5.softwareVechi;

public class MedicamentMagazin {

    private String denumire;
    private boolean retetaVerificata;

    public MedicamentMagazin(String denumire) {
        this.denumire = denumire;
        this.retetaVerificata=false;
    }
    public void achizitioneazaMedicament(){
        prezintaReteta();
        if(retetaVerificata){
            System.out.println("Medicamentul "+this.denumire+" a fost achizitionat!");
        }else{
            System.out.println("Medicamentul "+this.denumire+" nu se afla pe reteta!");
        }
    }

    protected void prezintaReteta(){
        System.out.println("Verificare reteta!");
        this.retetaVerificata=true;
    }


}
