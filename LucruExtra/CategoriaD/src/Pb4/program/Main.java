package Pb4.program;

import Pb4.clase.Cont;
import Pb4.clase.ICont;

public class Main {
    public static void main(String[] args) {
        Cont cont1=new Cont("BNR","Gigel","1234567891234","0987654321098765");
        Cont cont2= (Cont) cont1.clone();
        cont2.setNumeBanca("ING");
        System.out.println(cont1);
        System.out.println(cont2);
    }
}