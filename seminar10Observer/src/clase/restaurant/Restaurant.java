package clase.restaurant;

public class Restaurant extends Subiect{
    private String adresa;

    public Restaurant(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void notificareMeniuNou() {
        super.notificaObservatori("Restaurantul de la adresa "+adresa+" si-a schimbat meniul");
    }

    @Override
    public void notificareOfertaPret() {
        super.notificaObservatori("Restaurantul de la adresa "+adresa+" are o oferta de pret");
    }

    @Override
    public void notificareEveniment(String data) {
        super.notificaObservatori("In data "+data+" la adresa "+adresa+" va avea loc un evemniment");

    }
}
