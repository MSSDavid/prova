package br.ufg.inf.es.construcao.buble48;

public class Buble48 {
    
    public static void buble(int a[], int n) {
        
        if (n < 0) { 
            throw new IllegalArgumentException("n: Menor que 0");
        }

        int p = n-1;        
       
        while (p >= 1) {
            int i = 0;
            while (i < p) {
                if (a[i] < a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i+1];
                    a[i+1]=t;
                }
                i = i +1;
            }
            p = p - 1;
        }
        
    }
    
}