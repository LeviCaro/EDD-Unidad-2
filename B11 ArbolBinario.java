/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_11_ARBOL_BINARIO;


public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null; //ARBOO VACIO       
    }
    
    //APARTIR DE AQUI ES RECURSIVO 
    //AGREGAR UN NODO
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //VERIFICAR SI HAY NODOS EN EL ARBOL
        if(root == null){ //ARBOL VACIO
            root = nuevo;
        }else{ //HAY NODOS
            //METODO RECURSIVO PARA AGREGAR NODOS 
            addRecu(root, nuevo);
    }
}
    //METODO RECURSIVO (NODO ACTUAL, NODO NUEVO)
    private void addRecu(Nodo actual, Nodo nuevo) {
        //VERIFICAR EL LADO AL QUE VA EL NODO
        if(nuevo.getDato() < actual.getDato()){   //IZQUIERDO: VALOR NUEVO MENOR QUE NODO ACTUAL
            if(actual.getIzquierda() == null){ //HAY ESPACIO, AQUI SE INSERTA EL NODO NUEVO  
                actual.setIzquierda(nuevo);
            }else{ //LLAMAR DE NUEVO AL METODO RECURSIVO, PERO MOVIENDOME A LA IZQUIERDA  
                addRecu(actual.getIzquierda(), nuevo);
            }
        }else if(nuevo.getDato() > actual.getDato()){  //DERECHA
            if(actual.getDerecha() == null){ //HAY ESPACIO, AQUI SE INSERTA EL NODO NUEVO  
                actual.setDerecha(nuevo);
            }else{ //LLAMAR DE NUEVO AL METODO RECURSIVO, PERO MOVIENDOME A LA IZQUIERDA  
                addRecu(actual.getDerecha(), nuevo);
            }
        }else{ //VALORIGUAL AL ACTUAL
            System.out.println("El valor ya existe en el arbol");
        }
    }
    
    //IMPRIMIR NODOS DEL ARBOL 
    public void printPreOrder(){
        preOrder (root); //LLAMA AL METODO RECURSIVO
    }
    
    private void preOrder(Nodo actual){
        if(actual !=null){
            System.out.print("[" + actual.getDato() + "]"); //VISIT NODE
            preOrder(actual.getIzquierda()); //TRAVERS LEFT SUBTREE
            preOrder(actual.getDerecha()); //TRAVERS RIGHT SUBTREE
        }
    }
    
    //INORDER
    public void printInOrder(){
        inOrder (root); //LLAMA AL METODO RECURSIVO
    }
    
    private void inOrder(Nodo actual){
        if(actual !=null){
            inOrder(actual.getIzquierda()); //TRAVERS LEFT SUBTREE
            System.out.print("[" + actual.getDato() + "]"); //VISIT NODE
            inOrder(actual.getDerecha()); //TRAVERS RIGHT SUBTREE
        }
    }
    
    //POSTORDER
    public void printPostOrder(){
        postOrder (root); //LLAMA AL METODO RECURSIVO
    }
    
    private void postOrder(Nodo actual){
        if(actual !=null){
            postOrder(actual.getIzquierda()); //TRAVERS LEFT SUBTRE
            postOrder(actual.getDerecha()); //TRAVERS RIGHT SUBTREE
            System.out.print("[" + actual.getDato() + "]"); //VISIT NODE
        }
    }
}
