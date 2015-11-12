package br.ufg.inf.es.construcao.equac36;

/**
 * Resolve uma equação por meio de vários laços.
 */
public class Eq36 {

    /**
     * @param s Contador de repetições.
     * @return Resultado de quantas repetições aconteceram.
     */      
    public static int eq36(int s) {
        
        s = 0;
        int x = 1;
        int y = 0;
        int z = 0;
        int w = 0;
        
        while (x <= 96) {
            y = 1;
            
            while (y <= 65) {
                z = 1;
                
                while (z <= 39) {
                    w = 1;
                    
                    while (w <= 28) {
                        if ((2*x)+(3*y)+(5*z)+(7*w) == 210) {
                            s++;
                        }
                        w++;
                    }
                    z++;
                }
                y++;
            }
            x++;
        }
        
        return s;
    }
    

    
}

