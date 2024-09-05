package clase;

public class AchizitiePeBazaDeReteta extends AchizitieMedicamente{
    private Reteta reteta;

    public AchizitiePeBazaDeReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul "+reteta.getNrReteta());
    }

    @Override
    public boolean verificaStoc() {
        for(String medicament:reteta.getMedicamente()){
            if(!super.stocuri.containsKey(medicament)){
                System.out.println("Medicamentul "+medicament+" nu este in stoc!");
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("Medicamentele pentru reteta "+reteta.getNrReteta()+" au fost aduse!");
        for(String medicament:reteta.getMedicamente()){
            int stocDisponibil=super.stocuri.get(medicament)-1;
            super.stocuri.replace(medicament,stocDisponibil);
        }
        //parcurgem Map if medicament are val <= 0 va fi scos din lista cu remove
    }

    @Override
    public void incaseaza() {
        System.out.println("Au fost incasati banii pentru reteta "+reteta.getNrReteta());
    }

    @Override
    public void emitereBon() {
        System.out.println("Bonul pentru reteta "+reteta.getNrReteta()+" a fost emis");
    }

    @Override
    public void respingeAchizitie() {
        System.out.println("Medicamentele din reteta "+reteta.getNrReteta()+" nu sunt disponibile");

    }
}
