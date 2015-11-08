package br.ufg.inf.es.construcao.fatsom17;
import br.com.es.construcao.produto4.Produto;

public class Fatsom {
    
    public static int fatsom(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");
        }
        int i = 2;
        int f = 1;
        
        while (i <= n) {
            f = Produto.produto(f, i);
            i += 1;
        }
        
        return f;
    }
    
}
