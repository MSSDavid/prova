package br.ufg.inf.es.construcao.mdc212;

/**
 *
 * @author alunoinf
 */
public class Mdc2 {
    
    public static int mdc2(int a, int b) {
        
        if (a < b) {
            throw new IllegalArgumentException("A menor que B");
        }
        
        if (b < 0) {
            throw new IllegalArgumentException("B menor que 0");
        }
        
        while (a != b) {
            if (a > b) {
                a -= b;
            }else {
                b -= a;
            }
        }
        
        return a;
    }
    
}
