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
public class Agenda
{
    String nombre;
    String telefono;
    
    Contacto[] contactos;
    Evento[] eventos;
    
    public Agenda(String nombre)
    {
        this.nombre = nombre;
        contactos = new Contacto[10];
        eventos = new Evento[10];
        
        for(int i = 0; i < contactos.length; i++)
        {
            contactos[i] = new Contacto("Juan" + i,"546785487");
            
        }
    }
}
