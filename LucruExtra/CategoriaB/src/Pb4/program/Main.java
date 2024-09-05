package Pb4.program;


import Pb4.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare("Ionel",4,"0040743569008");
        Rezervare rezervare2=(Rezervare) rezervare1.cloneaza();
        System.out.println(rezervare2);

    }
}