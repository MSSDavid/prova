package br.com.es.construcao.potenciasoma06;

/*import br.com.es.construcao.produto4;*/
/**
 * x: Base
 * y: Potencia
 * p: Variável Auxiliar
 * d: Resultado
 */
public class PotSom {
    
    public static int potsom(int x, int y) {
        
        if (x <= 0) {
            throw new IllegalArgumentException("x: Menor que 0");            
        }
        
        if (y < 1) {
            throw new IllegalArgumentException("y: Menor ou igual a 1");            
        }
        
        int i = 1;
        int p = x;
        
        while (i < y) {
            p = (p * x);
            i += 1;
        }
        
        return p;
    }
    
}
