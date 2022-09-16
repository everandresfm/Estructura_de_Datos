

import javax.swing.JOptionPane;
/**
 *
 * @Ever Farinha
 */
public class VelocidadAuto {

    public static void main(String[] args) {
        
        String marca = JOptionPane.showInputDialog("Ingrese la marca del auto");
        String modelo= JOptionPane.showInputDialog("Ingrese el modelo del auto"); ;
        double  velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad maxima del auto"));
         if (velocidad <120){ JOptionPane.showMessageDialog(null,"El auto"+" " +marca+" "+modelo+" "+"con "+velocidad+"km es para diversion");
         } else if (velocidad >= 120 && 250>velocidad){
             JOptionPane.showMessageDialog(null,"El auto"+" " +marca+" "+modelo+" "+"con "+velocidad+"km es para diversion");
        } else if (velocidad<250){
                JOptionPane.showMessageDialog(null,"El auto"+" " +marca+" "+modelo+" "+"con "+velocidad+"km es para diversion");
                }
          
        }
      
    }
    

