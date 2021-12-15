/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_18_COLLECTIONS_4;

import java.util.LinkedHashSet;
import java.util.Set;




public class EVA2_18_COLLECTIONS_4 {
    public static void main (String [] args){
        //CONJUNTOS: MATEMATICAS DISCRETAS -> NO TIENE ELEMENTOS RPETIDOS 
        Set<Integer>conjunto = new LinkedHashSet<>();
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        conjunto.add(400);
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        System.out.println(conjunto);
    }
}
