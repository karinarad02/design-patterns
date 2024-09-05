package clase;

public class Reteta {
    private int nrReteta;
    private int nrMedicamente;
    private Stare stare;

    public Reteta(int nrReteta, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.nrMedicamente = nrMedicamente;
        this.stare=new Emisa();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void solicitaMedicamente(){

        if(this.stare instanceof Emisa){
            System.out.println("Conform retetei cu numarul "+this.nrReteta+" au fost solicitate "+this.nrMedicamente+" medicamente");
            Stare solicitata=new Solicitata();
            solicitata.schimbaStare(this);
        }else{
            System.out.println("Medicamentele din reteta "+this.nrReteta+" nu pot fi solicitate!");
        }

    }
    public void cumparaMedicamente(){
        if(this.stare instanceof Solicitata){
            System.out.println("Conform retetei cu numarul "+this.nrReteta+" au fost achizitionate "+this.nrMedicamente+" medicamente");
            Stare achizitionata=new Achizitionata();
            achizitionata.schimbaStare(this);
        }else{
            System.out.println("Medicamentele din reteta "+this.nrReteta+" nu pot fi achizitionate!");
        }
    }
    public void respingeAchizitie(){
        if(this.stare instanceof Solicitata){
            System.out.println("Ne pare rau, nu avem medicamentele din reteta cu numarul "+this.nrReteta+" !");
            Stare emisa=new Emisa();
            emisa.schimbaStare(this);
        }else{
            System.out.println("Reteta nu poate fi respinsa!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nrReteta=").append(nrReteta);
        sb.append(", nrMedicamente=").append(nrMedicamente);
        sb.append(", stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}
