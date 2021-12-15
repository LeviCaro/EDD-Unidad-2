/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;


public class EVA2_4_GCD {

    public static void main(String[] args) {
        
        System.out.println("El MCD de 180 y 48 es " + gcd(48,180));
        
    }
    
    public static int gcd(int iDividendo, int iDivisor){
        //¿Como calculmos el residuo?
        //Modulo --> %
        if(iDivisor == 0)  // Se detiene
            return iDividendo;
        else{            // La recursividad 
            int iResi = iDividendo % iDivisor;
            return gcd(iDivisor, iResi);
        }
        
    }
    
}
