/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_14_COLLECTIONS_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class EVA2__14_COLLECTIONS_2 {
    
    public static void main (String [] args){
        //QUEUE ES UNA LISTA PERO CON COMPORTAMIENTO DE QUEUE: INSTERATR AL FINAL, LLER AL INICIO
        Queue <Integer> queue = new LinkedList();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("STACK");
        
        
        Stack <Integer> stack = new Stack();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);
        stack.add(500);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());    
        System.out.println(stack);

    }
}
