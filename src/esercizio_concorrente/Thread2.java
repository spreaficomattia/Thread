package esercizio_concorrente;

import java.io.*;

public class Thread2 implements Runnable{
    private Buf buffer;
    private String name;
    int cout=0;
    Thread2(Buf buffer, String name){
        this.buffer=buffer;
        this.name=name;
        }
    public void run(){
            try{
                Thread.sleep(1);
                for(int i=3;i<6;i++){
                    buffer.put(i,(int)(Math.random()*10));
                    System.out.println("Inserito: "+name);
                    }
             }
             catch(InterruptedException e){
                System.out.println("Thread 2 Interrotto");
                }
            finally{
                System.out.println("----------");
                }
    }
}
