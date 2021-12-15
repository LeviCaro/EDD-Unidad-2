/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA2_13_TIPOS_DATOS_GENERICOS;


public class EVA2_13_TIPOS_DATOS_GENERICOS {
     
    public static void main (String [] args){
        Prueba <Integer> prueba = new Prueba();
        prueba.setValor(100);
        System.out.println(prueba.getValor());
    }
}

class Prueba <T> { 
    private T valor;
    
    public Prueba() {    
    }
    
    public Prueba(T valor){
      this.valor = valor;  
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}