package br.ufg.inf.es.construcao.cpf34;

import br.ufg.inf.es.construcao.mod27.Mod27;

/**
 * Verifica se o número é um CPF válido
 */
public class CPF34 {

    /**
     * @param d[] CPF a ser verificado
     * @return Verdadeiro se for válido e falso se for inválido.
     */     
    public static boolean cpf(int d[]) {
        
        
        int c = 7;
        int p = d[8];        
        int s = d[8];
        
        while (c >= 0) {
            p += d[c];
            s += p;
            c = c - 1;
        }
        
        int j = Mod27.mod27(Mod27.mod27(s, 11), 10);
        int k = Mod27.mod27(Mod27.mod27(((s - p) + (9 * j)), 11), 10);
        
        return ((j == d[9]) && (k == d[10]));  
    }
    
}
