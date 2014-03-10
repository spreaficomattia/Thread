package esercizio_concorrente;

import java.io.*;

public class Buf {
    int b[]=new int[12];
    void put(int i, int n){
        b[i]=n;
        }
    int get(int i){
        return(int)b[i];
        }
}
