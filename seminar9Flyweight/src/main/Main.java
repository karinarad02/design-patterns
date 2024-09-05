package main;

import clase.Flyweight;
import clase.FlyweightFactory;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Reteta reteta1=new Reteta("reteta1",12,3);
        Reteta reteta2=new Reteta("reteta2",10,1);
        Reteta reteta3=new Reteta("reteta3",9,2);
        Reteta reteta4=new Reteta("reteta4",42,7);
        Reteta reteta5=new Reteta("reteta5",108,8);

        Flyweight client1=flyweightFactory.getClient("1234567","Gigel");
        client1.achizitionareReteta(reteta1);
        flyweightFactory.getClient("1234567","Gigel").achizitionareReteta(reteta2);

        flyweightFactory.getClient("8765432","Ionel").achizitionareReteta(reteta3);
        flyweightFactory.getClient("8765432","Ionel").achizitionareReteta(reteta4);
        flyweightFactory.getClient("8765432","Ionel").achizitionareReteta(reteta5);


    }
}