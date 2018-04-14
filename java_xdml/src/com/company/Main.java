package com.company;

public class Main {



    public static void main(String[] args) {
        Cal2 t = new Cal2();
        t.a = 2;
        t.b = 3;

        System.out.println(t.result(2,2));

        Cal2 t2 = new Cal2();
        t2.a = 1;
        t2.b = 2;


        System.out.println(t2.result(2,2));

        t.a = 5;
        t.b = 6;

        System.out.println(t.result(2,2));
    }


}
