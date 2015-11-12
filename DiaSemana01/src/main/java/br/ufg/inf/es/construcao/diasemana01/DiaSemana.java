package br.ufg.inf.es.construcao.diasemana01;

/**
 * Informa o dia da semana (quarta, quinta) de uma data a partir de 1753
 */
public class DiaSemana {
     
     /**
     * @param d Dia da data a ser consultada
     * @param m Mês da data a ser consultada
     * @param a Ano da data a ser consultada 
     * @return  Recebe o número correspondente (0: segunda, 1: terça...);
     */    
    public static int diasemana (int d, int m, int a) {
        if ((d < 1) || (d > 31)) {
            throw new IllegalArgumentException("d: Fora da faixa de 1-31");
        }
       
        if ((m < 1) || (m > 12)) {
            throw new IllegalArgumentException("m: Fora da faixa de 1-12");
        }
        
        if (a < 1753) {
            throw new IllegalArgumentException("a: Menor que 1753");
        }
        
        if ((m == 1) || (m == 2)) {
            m += 12;
            a -= 1;
        }
        
        int s = d + (2 * m) + ((3 * (m + 1)) / 5) + a + (a / 4) - (a / 100) + 
                (a / 400);
        
        return (s % 7);
    }
    
}