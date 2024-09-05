package clase.restaurant;

public class SalaDeSport extends Subiect{
    @Override
    public void notificareMeniuNou() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void notificareOfertaPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void notificareEveniment(String data) {
        super.notificaObservatori("In data de "+ data+" in sala de sport va avea loc un eveniment");
    }

    public void notificareMeciVolei(){
        super.notificaObservatori("In sala de sport are loc un meci de volei");
    }
}
