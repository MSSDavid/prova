package br.ufg.inf.es.construcao.luhn35;

/**
 *
 * @author alunoinf
 */
public class Luhn35 {
    
    public static int luhn (int n[], int k) {
        
        if (k < 2) {
            throw new IllegalArgumentException("k: menor que 2");
        }
        
        k = k - 1;
        int j = k;
        /*while (j > 0) {
            n[j] = n[j] % 10;
            j -= 1;
        }*/
        
        int i = 0;
        int p = 0;
        int l = k - 1;
        boolean a = false;
        int t = 0;
        
        while (l > 0) {
            if (a) {
                p += n[l];
            }else {
                t = n[l] * 2;
                i += (t/10) + (t % 10); //Editar isso depois...
            }
            
            l -= 1;
            a = !a;
        }
        
        return (10 -((i+p) % 10));
    }
    
}

