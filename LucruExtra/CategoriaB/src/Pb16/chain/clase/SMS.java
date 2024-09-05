package Pb16.chain.clase;

public class SMS extends ModNotificare{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getTelefon()!=null) {
            System.out.println("SMS: Clientul" + client.getNume() + " a primit mesajul " + mesaj);
        }else{
            super.getSuccesor().notifica(client,mesaj);
        }
    }
}
