package Pb5.softVechi;

public class MedicamentVanzare {
    private int id;
    private double stoc;

    public MedicamentVanzare(int id, double stoc) {
        this.id = id;
        this.stoc = stoc;
    }

    public void setareMedicament(int id) {
        this.id = id;
    }
    public boolean verificareDisponibilitate(double cerut) {
        if(cerut <= this.stoc){
            System.out.println("Medicamentul este in stoc!");
            return true;
        }else {
            System.out.println("Stoc insuficient!");
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentVanzare{");
        sb.append("id=").append(id);
        sb.append(", stoc=").append(stoc);
        sb.append('}');
        return sb.toString();
    }
}
