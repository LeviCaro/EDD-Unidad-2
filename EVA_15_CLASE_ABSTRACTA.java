/**
 *
 * @author Daniel Levi Caro Alvarado
 */
package EVA_15_CLASE_ABSTRACTA;


public class EVA_15_CLASE_ABSTRACTA implements Algo{
    
    public static void main (String [] args){
        Prueba prueba = new Prueba () {
            @Override
            public void algo() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        prueba.algo();
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean c() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


abstract class Prueba{
    abstract public void algo();
    public void d(){
        
    }
}   
 interface Algo{
    public void a();
    public int b();
    public boolean c();
}