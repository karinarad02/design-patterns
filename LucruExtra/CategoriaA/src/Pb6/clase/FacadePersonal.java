package Pb6.clase;

public class FacadePersonal {
    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public FacadePersonal(Pacient pacient, Medic medic, Salon salon) {
        this.pacient = pacient;
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(){
        this.pacient.verificaGravitateStare();
        this.medic.confirmareInternare();
        this.salon.disponibilitatePat();
    }
}
