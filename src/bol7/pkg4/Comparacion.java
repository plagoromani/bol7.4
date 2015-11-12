
package bol7.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Comparacion {

   
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    private String nombre;
    private float peso;
    public Comparacion(){
    
    }
    public Comparacion (String nombre, float peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    public int pedirPeso(){
        return (Short.parseShort(JOptionPane.showInputDialog("teclea peso")));
    }
    public String nombre(){
        String respuesta = JOptionPane.showInputDialog("nombre persona");
        return respuesta;
    }
    
    public static void compararPeso(Comparacion persona1,Comparacion persona2){
        if (persona1.peso<persona2.peso){
            System.out.println(persona1.nombre + "mas pesado"+(persona1.peso - persona2.peso));
        }
        else if (persona1.peso>persona2.peso){           
            System.out.println(persona2.nombre+ "mas pesado" + (persona2.peso - persona1.peso));
        }
        else{
            System.out.println("pesan igual");
        }
    }
}

 
    
    



