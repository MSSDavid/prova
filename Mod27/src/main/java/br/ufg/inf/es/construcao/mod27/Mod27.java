package br.ufg.inf.es.construcao.mod27;

/**
 * Calcula o resto da divisão entre dois números
 */
public class Mod27 {
    
    /**
     * @param x Divisor da data a ser consultada
     * @trhow x Não deve ser menor que 0.
     * @param y Dividendo da data a ser consultada
     * @trhow y Não deve ser menor que 0.
     * @return  Recebe o resto da divisão dos números acima
     */     
    public static int mod27(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x: Menor que 0");
        }
        if (y < 0) {
            throw new IllegalArgumentException("y: Menor que 0");
        }
        
        int s = x;
        
        while (s >= y) {
            s -= y;
        }
        
        return s;
    }
    
}