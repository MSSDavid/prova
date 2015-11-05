package br.com.es.construcao.propriedade302507;


/**
 * x: Base
 * y: Potencia
 * p: Variável Auxiliar
 * d: Resultado
 */
public class Prop3025 {
    
    public static boolean prop3025(int n) {
        
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0");            
        }
        
        if (n > 9999) {
            throw new IllegalArgumentException("n: Maior que 9999");            
        }
        
        int i = (n / 100);
        int j = (n % 100);
        
        return (((i + j)*(i + j))==n);
    }
    
}