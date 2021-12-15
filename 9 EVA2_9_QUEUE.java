/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_9_QUEUE;


public class Eva2_9_Queue {
    
    public static void main (String[] args){
        MyQueue myQueue();
        myQueue.add(100);
        myQueue.add(200);
        myQueue.add(300);
        myQueue.add(400);
        myQueue.add(500);
        myQueue.printList();
        try {
        System.out.print(myQueue.peek());
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
