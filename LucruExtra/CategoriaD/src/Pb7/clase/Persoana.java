package Pb7.clase;

public class Persoana {
    private String nume;
    private int varsta;
    private boolean urmarit;
    private boolean creante;

    public Persoana(String nume, int varsta, boolean urmarit, boolean creante) {
        this.nume = nume;
        this.varsta = varsta;
        this.urmarit = urmarit;
        this.creante = creante;
    }

    public void verificaVarsta(){
        if(this.varsta>=18){
            System.out.println(this.nume+" este major");
        }else{
            System.out.println(this.nume+" este minor");
        }
    }

    public void verificaUrmarire(){
        if(this.urmarit){
            System.out.println(this.nume+" este urmarit de politie");
        }else{
            System.out.println(this.nume+" NU este urmarit de politie");
        }
    }

    public void verificaCreante(){
        if(this.creante){
            System.out.println(this.nume+" are creante la alte banci");
        }else{
            System.out.println(this.nume+" NU are creante la alte banci");
        }
    }
}
