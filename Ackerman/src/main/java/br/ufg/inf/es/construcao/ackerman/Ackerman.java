package br.ufg.inf.es.construcao.ackerman;

/**
 * Calcula um número na função de Ackerman
 */
public class Ackerman {

    /**
     * @param x Primeiro elemento da função.
     * @trhow x Não pode ser menor que zero
     * @param y Segundo elemento da função.
     * @trhow y Não pode ser menor que zero
     * @return Resultado da função de Ackerman.
     */      
    public static int ack(int x, int y) {
        
        if (x < 0) { 
            throw new IllegalArgumentException("x: Menor que 0");
        }
        
        if (y < 0) { 
            throw new IllegalArgumentException("y: Menor que 0");
        }
               
        if (x == 0) {
            return (y + 1);
        }
        
        if (y == 0) {
            return ack(x - 1, 1);
        }
        
        return ack(x-1, ack(x, y -1));
    }
    

    
}