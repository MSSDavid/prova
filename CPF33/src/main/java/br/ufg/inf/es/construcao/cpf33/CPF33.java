package br.ufg.inf.es.construcao.cpf33;

import br.ufg.inf.es.construcao.mod27.Mod27;

/**
 * Verifica se o número é um CPF válido
 */
public class CPF33 {

    /**
     * @param d[] CPF a ser verificado
     * @return Verdadeiro se for válido e falso se for inválido.
     */      
    public static boolean cpf(int d[]) {
        
        
        int sj = d[0] + 2*d[1] + 3*d[2] + 4*d[3] + 5*d[4] + 6*d[5] + 7*d[6] + 8*d[7] + 9*d[8];
        int sk = d[1] + 2*d[2] + 3*d[3] + 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7] + 8*d[8] + 9*d[9];        
        int j = Mod27.mod27(Mod27.mod27(sj, 11), 10);
        int k = Mod27.mod27(Mod27.mod27(sk, 11), 10);
        
        return ((j == d[9]) && (k == d[10]));  
    }
    
}
