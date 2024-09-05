package Pb2.program;

import Pb2.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("Audi",15,20.5F);
        Autobuz autobuz2= (Autobuz) autobuz1.clone();
        System.out.println(autobuz2);
    }
}