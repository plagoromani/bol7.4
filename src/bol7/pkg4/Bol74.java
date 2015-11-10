
package bol7.pkg4;

/**
 *
 * @author Pablite5
 */
public class Bol74 {

   
    public static void main(String[] args) {
        Comparacion persona1= new Comparacion();
        Comparacion persona2= new Comparacion();
        persona1.setNombre(persona1.nombre());
        persona1.setPeso(persona1.pedirPeso());
        persona2.setNombre(persona2.nombre());
        persona2.setPeso(persona2.pedirPeso());
        Comparacion.compararPeso(persona1,persona2);
    }
    
}
