
package agenda.beans;

/**
 *
 * @author u
 */
public class Contacto
{
    String nombre;
    int edad;
    String telefono;
    String direccion;
    
    public Contacto(String nombre, String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    
    private Contacto()
    {
        
    }
}
