package Pb5.softNou;

public class MedicamentDepozit {
    private int id;
    private double stoc;

    public MedicamentDepozit(int id, double stoc) {
        this.id = id;
        this.stoc = stoc;
    }

    public int getId() {
        return id;
    }

    public double getStoc() {
        return stoc;
    }

    public boolean verificaStocPentruMedicament(int id, double cerut){
        if(id==this.id){
         if(cerut <= this.stoc){
             System.out.println("Id corect si stoc suficient!");
             return true;
         }else{
             System.out.println("Id corect si stoc insuficient!");
             return false;
         }
        }else{
            System.out.println("Id incorect");
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentDepozit{");
        sb.append("id=").append(id);
        sb.append(", stoc=").append(stoc);
        sb.append('}');
        return sb.toString();
    }
}
