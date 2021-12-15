/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_9_QUEUE;


public class Lista {
     private Nodo inicio;//Acceso a mi lista, punto de partida
    private Nodo fin;
    private int tama;//contador de nodos
    
    public Lista(){
        inicio = null;//Lista Vacia
        fin = null;
        tama = 0;
    }
    
    //Agegar nodos
    public void add(int valor){//O(1)
        Nodo nuevo = new Nodo(valor);
        
        //Hay nodos en la lista?
        if(inicio == null){//Lista vacia
            inicio = nuevo;//conectamos el primer nodo a la lista
            fin = nuevo;
        }else{//Lista con nodos
            //Hay que movernos al final de la lista
            //Usando TEMP, Nodo por Nodo hasta llegar al final
            /*Nodo temp = inicio;//aqui empezamos
            //WHILE
            while(temp.getSiguiente() != null){//Mientras TEMP != Null vamos a mover
                temp = temp.getSiguiente();//mover a temp al siguiente nodo
            }
            temp.setSiguiente(nuevo);//conectamos al fnal de la lista al nuevo nodo*/
            //agregar el nodo final a la lista:
            fin.setSiguiente(nuevo);
            fin = nuevo;//Nos movemos al final de la Lista
        }
        tama++;
    }
    //Imprimir la lista
    public void printList(){//O(N)
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while(temp != null){//Mientras TEMP != Null vamos a mover
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
    }
    //Borrar la Lista    O(1)
    public void clear(){//borramos tdos los nodos de la lista
        inicio = null;
        fin = null;
        tama = 0;
    }
    //Contar los Nodos:
    public int length(){ //O(1)
        /*int iCont = 0; //O(N)
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }*/
        //return iCont;
        return tama;
    }
    
    //La Lita esta vacia: True, con Nodos: False
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    
    }
    //Recuperar un valor de la lista:
    public int get(int pos) throws Exception{//O(N)
        //Verificacion
        if(isEmpty()){//Lista este vacia
            throw new Exception("No hay valores almacenados en la lista!!");
        }else{ //Posicion que no exista: posicion negativa o que nos pasemos
            //pos tiene que estar entre cero y N-1
            if ((pos < 0) || (pos >= length()))//si pos es meno a cero o pos es mayor igual a N
                throw new Exception("El valor " + pos + " no es una posicion valida en la lista!!");
        }
        
        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
        return temp.getDato();
    }
    
    private void insertAtBeginnig(Nodo nuevo){//O(1)
        nuevo.setSiguiente(inicio);//Primero conectamos el nuevo nodo a la lista
        inicio = nuevo;            //Conetar la lista al nuevo codigo
    }
    
    public void insertAt(int pos, int valor){//O(N)
        Nodo nuevo = new Nodo(valor);
        //Validar
        //Situaciones:
        if(pos == 0){//Insertar al Inicio
            insertAtBeginnig(nuevo);
            
        }
        else{//Cualquier otro caso
            //Movernos al nodo previo a la posicion
            Nodo temp = inicio;
            for (int i = 0; i < (pos - 1); i++) {
                 temp = temp.getSiguiente();//mover a temp al siguiente nodo
           }
           //Falta Reconectar
           //Primero conectamos el nuevo nodo
           nuevo.setSiguiente(temp.getSiguiente());
           //Conectamos la lista al nuevo nodo
           temp.setSiguiente(nuevo);
        }
        tama++;
    }
    
    public void deleteAt(int pos){
        int iTamaLista = length();//obtengo el tamaño de la lista
        //Validar
        if(iTamaLista == 1){
            clear();
        }else{
        //Situaciones:
        if(pos == 0){//Borar un nodo al inici
            inicio = inicio.getSiguiente();
        }
        else{//Cualquier otro caso
            //Movernos al nodo previo a la posicion
            Nodo temp = inicio;
            for (int i = 0; i < (pos - 1); i++) {
                 temp = temp.getSiguiente();//mover a temp al siguiente nodo
           }
           //Falta Reconectar
           temp.setSiguiente(temp.getSiguiente() .getSiguiente());
           if(pos == (iTamaLista - 1))//verifico si es el ultimo nodo de la lista
               fin = temp;
            }
            tama--;
        }  
    }
}

