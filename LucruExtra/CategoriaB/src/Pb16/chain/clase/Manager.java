package Pb16.chain.clase;

public class Manager extends ModNotificare{

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println(client.getNume()+ " nu are email sau numar de telefon in baza de date!");

    }
}
