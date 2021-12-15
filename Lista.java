/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_7_LISTA_SIMPLE;


public class Lista {
    private Nodo inicio;  //ACCESO A LA LISTA, PUNTO DE PARTIDA 
    private Nodo fin;
    private int tama;  //CONTADOR DE NODOS
    
    public Lista(){
        inicio = null;  //LISTA VACIA
        fin = null;
        tama = 0;
    }
    
    //Agegar nodos
    public void add(int valor){  
        Nodo nuevo = new Nodo(valor);
        
        //HAY NODOS EN LA LISTA?
        if(inicio == null){  //LISTA VACIA
            inicio = nuevo;  //CONEXION DEL PRIMER NODO 
            fin = nuevo;
        }else{  //LISTA CON NODOS
            //LISTA CON NODOS 
            //HAY QUE MOVERNOS AL FINAL DE LA LISTA 
            //USANDO TEMP, NODO POR NODO HASTA LLEGAR AL FINAL 
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tama++;
    }
    
    public void printList(){
        Nodo temp = inicio;
        
        //WHILE
        while(temp != null){
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();
        }
    }
      
    public void clear(){
        inicio = null;
        fin = null;
        tama = 0;
    }
    
    public int length(){ 
        return tama;
    }
    
    //LISTA VACIA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    
    }
    
    public int get(int pos) throws Exception{
        
        if(isEmpty()){
            throw new Exception("No hay valores almacenados en la lista!!");
        }else{ 
            if ((pos < 0) || (pos >= length()))
                throw new Exception("El valor " + pos + " no es una posicion valida en la lista!!");
        }
        
        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente();  //MOVER A TEMP AL SIGUIENTE NODO 
        }
        return temp.getDato();
    }
    
    private void insertAtBeginnig(Nodo nuevo){
        nuevo.setSiguiente(inicio);  //SE CONECTA EL PRIMER NODO A LA LISTA
        inicio = nuevo;            
    }
    
    public void insertAt(int pos, int valor){
        Nodo nuevo = new Nodo(valor);
        
        if(pos == 0){  //INSERTAR AL INICIO 
            insertAtBeginnig(nuevo);
            
        }
        else{
            Nodo temp = inicio;
            for (int i = 0; i < (pos - 1); i++) {
                 temp = temp.getSiguiente();  //MOVER A TEMP AL SIGUIENTE NODO 
           }
           nuevo.setSiguiente(temp.getSiguiente());
           //SE CONECTA A LA LISTA AL NUEVO NODO 
           temp.setSiguiente(nuevo);
        }
        tama++;
    }
    
    public void deleteAt(int pos){
        int iTamaLista = length();  //TAMAÑO DE LA LISTA
        //VALIDAR
        if(iTamaLista == 1){
            clear();
        }else{
        //SITUACIONES
        if(pos == 0){
            inicio = inicio.getSiguiente();
        }
        else{
            Nodo temp = inicio;
            for (int i = 0; i < (pos - 1); i++) {
                 temp = temp.getSiguiente();
           }
           //RECONECTAR FALTANTE
           temp.setSiguiente(temp.getSiguiente() .getSiguiente());
           if(pos == (iTamaLista - 1))
               fin = temp;
            }
            tama--;
        }  
    }

    
}

