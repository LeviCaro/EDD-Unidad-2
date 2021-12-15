/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_8_LISTA_DOBLE;


public class Nodo {
    private int dato;
    private Nodo siguiente; //REFERENCIA
    private Nodo previo;
    
    //CONSTRUCTORES 
    public Nodo(){
        this.siguiente = null;
        this.previo = null;
    }
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
        this.previo = null;
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

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}
