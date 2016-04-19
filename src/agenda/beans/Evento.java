
package agenda.beans;

/**
 *
 * @author u
 */
public class Evento
{
    String fecha;
    String ubicacion;
    int prioridad;
    String nombre;
    
    public Evento(String nombre, String fecha)
    {
        this.nombre = nombre;
        this.fecha = fecha;
    }
    
    private Evento()
    {
        
    }
}
