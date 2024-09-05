package Pb5.softwareNou;

public class MedicamentFarmacie {
    private String denumire;

    public MedicamentFarmacie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul "+this.denumire+" a fost achizitionat!");

    }

    public String getDenumire() {
        return denumire;
    }
}
