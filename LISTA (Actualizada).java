/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;

public class LISTA {              //LISTA SIMPLEMETNE ENLAZADA 

    private NODO inicio;          //ACCESO A LISTA Y EL PUNTO DE PARTIDA 
    private NODO fin;
    
    public LISTA() {
        inicio = null;            // LISTA VACIA 
        fin = null;
    }

    //AGREGAR NODOS 
    public void add(Nodo nuevo) {
        //HAY NODOS EN LA LISTA?
        if (inicio == null) {           //LISTA VACIA 
            inicio = nuevo;             //CONECTAMOS EL PRIMER NODO A LA LISTA
            fin = nuevo;
        } else {                         //LISTA CON NODOS 
            //HAY QUE MOVERNOS AL FINAL DE LA LISTA 
            //USANDO TEMP, NODO POR NODO HASTA LLEGAR AL FINAL  
            Nodo temp = inicio; // AQUI SE EMPIEZA
            //WHILE
            while (temp.getSiguiente != null) {  //MIENTRAS TEMP != NULL NOS VA AMOVER 
                temp = temp.getSiguiente(); //MUEVE A TEMP AL SIGUIENTE NODO                 
            }
            temp.setSiguiente(nuevo); //CONECTAMOS AL FINALDE LA LISTA AL SIGUIENTE NODO 
        }
    }
    //IMPRIMIR LISTA 
    public void printList(){
        Nodo temp = inicio; // AQUI SE EMPIEZA
            //WHILE
            while (temp != null) {  //MIENTRAS TEMP != NULL NOS VA AMOVER 
                System.out.println(temp.getDatos() + " - ");
                temp = temp.getSiguiente(); //MUEVE A TEMP AL SIGUIENTE NODO                 
            }
    }
}
