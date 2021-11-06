/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;


public class EVA2_2_For_Recursivo_2 {

    public static void main(String[] args) {
        
        fakeForDown(5);
        
    }
    
    public static void fakeForDown (int iVal){
        System.out.println(iVal + " _ ");
        if(iVal > 1){
            fakeForDown(iVal - 1);  //Esto es lo que se debe de controlar
        }    
    }
    
}
