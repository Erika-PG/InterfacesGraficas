package UACI;
// Botones de comando y eventos de acción.
 import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JButton;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
 import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame
{
    private final JButton botonJButtonSimple; // boton con texto solamente
    private final JButton botonJButtonElegante; // boton con iconos

    //MarcoBoton agrega objetos JButton a JFrame
    public MarcoBoton()
    {
        super("button test ");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton(" simple Button");
        add(botonJButtonSimple);

        Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
        Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));
        botonJButtonElegante = new JButton("elegant Button", insecto1); // establece la imagen

        botonJButtonElegante.setRolloverIcon(insecto2); // establece la imagen de sustitución

        add(botonJButtonElegante); // agrega botonJButtonElegante a JFrame

        // crea nuevo ManejadorBoton para manejar los eventos de botón
         ManejadorBoton manejador = new ManejadorBoton();
         botonJButtonElegante.addActionListener(manejador);
         botonJButtonSimple.addActionListener(manejador);
    }
    // clase interna para manejar eventos de botón
      private class ManejadorBoton implements ActionListener
     {
    // maneja evento de botón
     @Override
     public void actionPerformed(ActionEvent evento)
     {
         JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s",
                 evento.getActionCommand()));
       }
     }
  } // fin de la clase MarcoBoton
