package br.ufg.inf.es.construcao.permutar;

import java.util.List;

/**
 * Implementa versão recursiva de permutação de elementos
 * de um conjunto.
 */
public class Permutar {
    public static List<String> permuta( String prefixo, String conjunto,
            List<String> resultadoParcial) {
        if (conjunto.length() == 1) {
            resultadoParcial.add(prefixo + conjunto);
            return resultadoParcial;
        }

        for (int i = 0; i <
                conjunto.length(); i++) {
            char cI = conjunto.charAt(i);

            StringBuilder sLinha = new StringBuilder(conjunto);
            sLinha.deleteCharAt(i);

            String pLinha = prefixo + cI;

            permuta(pLinha, sLinha.toString(), resultadoParcial);
        }

        return resultadoParcial;
    }
}
