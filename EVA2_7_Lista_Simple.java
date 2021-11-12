/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;


public class EVA2_7_Lista_Simple {
    public static void main (String [] args){
      
        //CREAR LISTA
        LISTA miLista = new LISTA (); //SE CREA UNA LISTA VACIA 
        int[] miArreglo = new int[1000000];
        for (int i = 0; i < miArreglo.length; i++){
            miArreglo[i] = (int)(Math.random() * 1000);
        }
        for (int i = 0; i < 100000; i++){
            miLista.add(new Nodo(i));
        }
    }    
}
