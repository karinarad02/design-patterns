package Pb16.chain.clase;

public class Email extends ModNotificare{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail()!=null){
            System.out.println("Email: Clientul"+client.getNume()+" a primit mesajul "+mesaj);
        }else{
            super.getSuccesor().notifica(client,mesaj);
        }
    }
}
