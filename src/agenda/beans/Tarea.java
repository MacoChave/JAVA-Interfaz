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
public class Tarea extends Evento
{
    String curso;
    int status;
    
    public Tarea(String fecha, String curso)
    {
        super(fecha, "Tareas");
        this.curso = curso;
    }
}
