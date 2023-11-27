package ut5_pascual_galvan;
import javax.swing.JFrame; // importamos marco
import javax.swing.JLabel; // importamos etiqueta
public class ut5 {

           public static void main (String[]args){
            // nombre del marco asiganos objeto frame a ventana
            JFrame ventana = new JFrame("Unidad 5");
            ventana.setSize(300, 300); // tamaño marco
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel etiqueta = new JLabel("Hola Mundo, Hola Soy Tania y estoy colaborando con Pascual"); // nombre etiqueta
            ventana.add(etiqueta); // añadimos la etiqueta al marco
            ventana.setVisible(true); // hacemos visible el marco
           }
}