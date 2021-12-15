/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_12_COLLECTIONS_1;
import java.util.LinkedList;

public class EVA2_12_COLLECTIONS_1 {
    
    
    public static void main (String [] args ){
        
        //LISTA ENLAZADA ---> LINKEDLIST
        LinkedList<Integer> linkedList = new LinkedList ();
        // < > TIPOS DE DATOS GENERICOS 
        
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        System.out.println(linkedList);
        System.out.println(linkedList.get(4));
        linkedList.remove(4);
        System.out.println(linkedList);
    }
}
