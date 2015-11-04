package br.com.es.construcao.prop1538;

/**
 *
 * @author David
 * O vê a seguinte propriedade: 153 então (1³)+(5³)+(3³)= 153;
 * 
 */
public class Prop1538 {
    
    public static boolean prop1538 (int n) {
        if ((n < 0) || (n > 999)) {
            throw new IllegalArgumentException("n");
        }
        
        int i =  (n / 100);
        int j = (n - 100 * i) / 10;
        int k = (n % 10);
        
        return ((i*i*i)+(j*j*j)+(k*k*k) == n);
    }   
}