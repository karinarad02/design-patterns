package Pb16.chain.program;

import Pb16.chain.clase.*;

public class Main {
    public static void main(String[] args) {
        ModNotificare email=new Email();
        ModNotificare sms=new SMS();
        ModNotificare manager=new Manager();

        email.setSuccesor(sms);
        sms.setSuccesor(manager);

        Client client1=new Client("Viorel","viorel@gmail.com","0723498520");
        email.notifica(client1,"Aceasta este o notificare");
        Client client2=new Client("Maricica",null,"0713985467");
        email.notifica(client2,"Alta notificare");
        Client client3=new Client("Lala",null,null);
        email.notifica(client3,"Inca o notificare");


    }

}
