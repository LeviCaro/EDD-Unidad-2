/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_8_LISTA_DOBLE;


public class EVA2_8_LISTA_DOBLE {
    
    public static void main (String[] args){
        
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.add(100);
        listaDoble.add(200);
        listaDoble.add(300);
        listaDoble.add(400);
        listaDoble.add(500);
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.printList();
        listaDoble.insertAt(0, 0);
        System.out.println("");
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.printList();
    } 
}
