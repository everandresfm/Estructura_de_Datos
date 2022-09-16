
import javax.swing.JOptionPane;


/**
 *
 * @Ever Farinha
 */
public class Ejemplo13 {

   
    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su nota de TPRN")); 
        String msg;
        msg = "";
        if (nota >= 90){
            msg = "Exelente!";
        } else{
            msg = "Reprobado";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
