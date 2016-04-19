/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.beans;

/**
 *
 * @author u
 */
public class Cumpleaños extends Evento
{
    Contacto contacto;
    String regalo;
    
    public Cumpleaños(String fecha, Contacto contacto)
    {
        super(fecha,"Cumpleaños");
        this.contacto = contacto;
    }
    
}
