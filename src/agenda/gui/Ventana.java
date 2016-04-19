
package agenda.gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author u
 */
public class Ventana extends JFrame
{
    JLabel label;
    JTextField textField;
    JButton button;
    public Ventana()
    {
        /*=======================================
        INSTANCIAR LOS ELEMENTOS Y DARLES ESTILOS
        =======================================*/
        label = new JLabel("Nombre:");
        label.setBounds(10, 10, 100, 20);
        
        textField = new JTextField();
        textField.setBounds(100, 10, 100, 20);
        
        button = new JButton("Aceptar");
        button.setBounds(500, 400, 200, 100);
        
        setLayout(null); //ORDENA MIS ELEMENTOS DE ESTA MANERA
        /*
        FlowLayout: Posicionamiento uno detrás de otro
        null: Se le inidca a cada elemento donde se posicionará
        */
        
        /*=====================
        DAR ESTILOS A LA VENTNA
        =====================*/
        setBounds(150,100,800, 600); //PosHorizontal, PosVertical, Width, Height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*===================
        AGREGAR LOS ELEMENTOS
        ===================*/
        add(label);
        add(textField);
        add(button);
        
        setVisible(true);
    }
}
