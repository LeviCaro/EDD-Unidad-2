/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;


public class NODO {
    private int dato;
    private Nodo siguiente; 

    //CONSTRUCTORES
    
    public NODO(){                //D E F A U L T
        this.siguiente = null; 
    }
    public NODO (int dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
    
    //GET Y SET 
    public int getDato() {
        return dato;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    

    
    
    
}
