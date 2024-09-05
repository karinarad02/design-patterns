package Pb5.main;

import Pb5.softNou.CreditLeasing;
import Pb5.softVechi.AdapterCredit;
import Pb5.softVechi.Credit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Credit:");
        Credit credit=new Credit("George",2);
        credit.acordaCredit();
        System.out.println("Leasing:");
        CreditLeasing creditLeasing=new CreditLeasing("Ana","B100ANA");
        creditLeasing.ofetaLeasing();
        System.out.println("Adapter:");
        AdapterCredit adapterCredit=new AdapterCredit(creditLeasing);
        adapterCredit.acordaCredit();
    }
}
