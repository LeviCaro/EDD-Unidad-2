/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;


public class EVA2_3_Factorial {

    public static void main(String[] args) {
        
        System.out.println("Factorial de 5 = " + factorialFor(5));
    
    }
    
    public static int factorial(int iVal){  //El factorial usando recursividad
        if(iVal == 0)
            return 1;
        else
            return iVal * factorial(iVal - 1);
    }
    
    public static int factorialFor(int iVal){  //El factorial usando un ciclo
        int iTemp = 0;
        for (int i = iVal; i > 0; i--) {
            iTemp = iTemp * i;
        }
        
        return iTemp;
    }
    
}
