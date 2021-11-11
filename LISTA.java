/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;


public class LISTA {              //LISTA SIMPLEMETNE ENLAZADA 
    private NODO inicio;          //ACCESO A LISTA Y EL PUNTO DE PARTIDA 
    
    public LISTA (){
        inicio = null;            // LISTA VACIA        
    }
    
    //AGREGAR NODOS 
    public void add(Nodo nuevo){
        //HAY NODOS EN LA LISTA?
        if (inicio == null){           //LISTA VACIA 
           inicio = nuevo;             //CONECTAMOS EL PRIMER NODO A LA LISTA   
        }else{                         //LISTA CON NODOS 
                                       //HAY QUE MOVERNOS AL FINAL DE LA LISTA 
                                       //USANDO TEMP, NODO POR NODO HASTA LLEGAR AL FINAL  
        Nodo temp = inicio; //SE EMPIEZA
        //WHILE
        while(){  //MIENTRAS TEMP != NULL NOS VA AMOVER 
            
        }
        } 
    }
    //IMPRIMIR LISTA 
}
