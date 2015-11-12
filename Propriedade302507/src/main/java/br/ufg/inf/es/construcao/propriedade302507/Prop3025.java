package br.ufg.inf.es.construcao.propriedade302507;

/**
 * Calcula a propriedade em que o XXYY=(XX+YY)*(XX+YY)
 */
public class Prop3025 {

    /**
     * @param n Número a ter sua propriedade avaliada
     * @return Retorna um valor verdadeiro caso o número atenda a propriedade,
     * ou falso, caso não atenda.
     */      
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