/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_9_QUEUE;


public class MyQueue extends Lista {
    //COMO LA FILA DE SUPERMERCADO
    //LOS ELEMENTOS SE AGREGAN AL FINAL
    //METODO ADD DE LA LISTA -> SIN CAMBIOS 
    //SOLO SE ACCEDE A LOS ELEMENTOS AL INICIO DE LA LISTA
    public int peek() throws Exception{ //REGRESA EL VALOR DEL ELEMENTO AL INICIO DE LA FILA 
        return get (0);
    }
    
    public int poll ()throws Exception {//REGRESA Y ELIMINA EL ELEMENTO DEL INICIO
        //GUARDA EL VALOR
        int iVal = get (0);
        //ELIMINAMOS EL VALOR
        deleteAt(0);
        //ENVIAMOS EL VALOR 
        return iVal;
    }
}
