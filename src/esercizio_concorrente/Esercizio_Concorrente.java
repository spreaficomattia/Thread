package esercizio_concorrente;

import java.io.*;

public class Esercizio_Concorrente {
    public static void main(String[] args) {
        Buf buffer=new Buf();
        System.out.println("Inizio");
        System.out.println("----------");
        Thread1 T1=new Thread1(buffer,"Thread1");
        Thread2 T2=new Thread2(buffer,"Thread2");
        Thread3 T3=new Thread3(buffer,"Thread3");
        Thread4 T4=new Thread4(buffer,"Thread4");
        Thread newThrd1=new Thread(T1);
        Thread newThrd2=new Thread(T2);
        Thread newThrd3=new Thread(T3);
        Thread newThrd4=new Thread(T4);
        newThrd1.start();
        newThrd2.start();
        newThrd3.start();
        newThrd4.start();
    }
}
