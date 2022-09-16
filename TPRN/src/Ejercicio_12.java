
import javax.swing.JOptionPane;


/**
 *
 * @Ever Farinha
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        String msg = "Hola "+ nombre+" "+apellido+"!";
        JOptionPane.showMessageDialog(null,msg);
    }
}
