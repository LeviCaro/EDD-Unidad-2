/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_7_LISTA_SIMPLE;


public class Nodo {
    
    private int dato;
    private Nodo siguiente;
    
    //CONSTRUCTORES
    public Nodo(){
        this.siguiente = null;
    }
    public Nodo (int dato){
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
