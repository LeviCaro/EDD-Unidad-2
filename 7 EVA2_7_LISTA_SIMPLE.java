/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_7_LISTA_SIMPLE;



public class EVA2_7_LISTA_SIMPLE {
    public static void main (String [] args){
      
        //CREAR LISTA
        Lista miLista = new Lista (); //SE CREA UNA LISTA VACIA 
        int[] miArreglo = new int[1000000];
        for (int i = 0; i < miArreglo.length; i++){
            miArreglo[i] = (int)(Math.random() * 1000);
        }
        for (int i = 0; i < 100000; i++){
            Lista add = miLista.add(new Nodo(i));
        }
    }    
}

