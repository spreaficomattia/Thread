package esercizio_concorrente;

import java.io.*;

public class Thread1 implements Runnable{
    private Buf buffer;
    private String name;
    int cout=0;
    Thread1(Buf buffer, String name){
        this.buffer=buffer;
        this.name=name;
        }
    public void run(){
            try{
                Thread.sleep(1);
                for(int i=0;i<3;i++){
                    buffer.put(i,(int)(Math.random()*10));
                    System.out.println("Inserito: "+name);
                    }
            }
            catch(InterruptedException e){
                System.out.println("Thread 1 Interrotto");
                }
            finally{
                System.out.println("----------");
                }
    }
}
