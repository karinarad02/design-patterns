package Pb6.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private String stare;

    public Pacient(String nume, int varsta, String stare) {
        this.nume = nume;
        this.varsta = varsta;
        this.stare = stare;
    }

    public void verificaGravitateStare(){
        System.out.println("Starea pacientului "+this.nume+" in varsta de "+this.varsta+" ani, este "+this.stare);
    }
}
