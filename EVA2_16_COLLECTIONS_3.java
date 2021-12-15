/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_16_COLLECTIONS_3;

import java.util.ArrayList;


public class EVA2_16_COLLECTIONS_3 {

    public static void main(String [] args){
        
        //ES MUT SIMILAR AL LINKEDLIST PERO TRABAJA CON ARREGLOS 
        //MEJOR PARA ALMACENAR Y LEER DATOS 
        //MALO PARA DATOS QUE CAMBIAN DE CANTIDAD 
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        arrayList.remove(4);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size (); i++ ){
            System.out.print("[" + arrayList.get(i) + "]");
        }
    }
}
