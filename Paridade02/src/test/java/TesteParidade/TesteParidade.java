package TesteParidade;

import br.ufg.inf.es.construcao.paridade.Paridade;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

/**
 *
 * @author David
 */
public class TesteParidade {
    
     
    @Test
    public void testCasos() {
        Assert.assertTrue(Paridade.paridade(12));
        Assert.assertFalse(Paridade.paridade(13));
        Assert.assertTrue(Paridade.paridade(0));        
       
    }   
}