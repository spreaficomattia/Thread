package esercizio_concorrente;

import java.io.*;

public class Thread3 implements Runnable{
    Buf buffer;
    private String name;
    int cout=0;
    int i;
    Thread3(Buf buffer, String name){
        this.buffer=buffer;
        this.name=name;
    }
    public void run(){
            try{
                Thread.sleep(1);
                for(i=6;i<9;i++){
                    buffer.put(i,(int)(Math.random()*10));
                    System.out.println("Inserito: "+name);
                 }
                for(int x=0;x<9;x++){
                    System.out.println(buffer.get(x));
                }
            }
            catch(InterruptedException e){
                System.out.println("Thread 3 Interrotto");
            }
            finally{
                System.out.println("----------");
            }
    }
}
