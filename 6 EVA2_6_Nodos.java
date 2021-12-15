/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package eva2_1_list_queue_stack;


public class EVA2_6_Nodos {
    public static void main (String [] args){
        Nodo inicio = new Nodo();
        inicio.datos = 100;
        inicio.referencia = new Nodo();
        inicio.referencia.datos = 200;
        inicio.referencia.referencia = null;
        System.out.println(inicio);
        System.out.println(inicio.referencia);
        System.out.println(inicio.datos);
        System.out.println(inicio.referencia.datos);
            
    }
}

class Nodo{
    int datos; //Aqui se guarda la informacion 
    Nodo referencia; //Permite enlazar nodos y crear cadenas (listas)
    
    
    
}
