


import javax.swing.JOptionPane;

/**
 *
 * @Ever Farinha
 */
public class Ejercicio_1 {

    public static void TEST(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("APLICACION EJECUTANDOSE");
        }
    }

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        TEST(num);
    }

}