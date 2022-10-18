package UACI;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class Suma {
    public static void main(String[] args) {
        // obtiene la entrada del usuario de los diálogos de entrada de JOptionPane

        String primerNumero =
                JOptionPane.showInputDialog("Enter the first integer");
        String segundoNumero =
                JOptionPane.showInputDialog("Enter the second integer");

        // convierte las entradas String en valores int para usarlos en un cálculo
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;

        // muestra los resultados en un diálogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null, "The sum is " + suma,
                "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);


    }
}
