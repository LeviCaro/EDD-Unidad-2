/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_17_COLLECTIONS_ITERATOR;

import java.util.Iterator;
import java.util.LinkedList;


public class EVA2_17_COLLECTIONS_ITERATOR {
    
    public static void main(String [] args){
        
        LinkedList<Integer> linkedList = new LinkedList ();
         
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        
        //ITERATOR: ITERADOR --> RECORRE ELEMEMTO X ELEMENTO ALMACENADO 
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){ //HAY NODO SIGUIENTE?
            int iVal = (int)iterator.next();
            System.out.print("[" + iVal + "]");
            
        }
    }
}
