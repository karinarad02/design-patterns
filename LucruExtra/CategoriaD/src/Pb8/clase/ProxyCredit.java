package Pb8.clase;

public class ProxyCredit implements InterfataCredit{
    Credit credit;
    private static String moneda;

    public ProxyCredit(Credit credit) {
        this.credit = credit;
    }

    public static void setMoneda(String moneda) {
        ProxyCredit.moneda = moneda;
    }

    @Override
    public void creareCont(Client client) {
        if(credit.getMoneda().equals(moneda)){
            this.credit.creareCont(client);
        }else{
            System.out.println("Nu puteti crea contul in alta moneda decat RON");
        }
    }
}
