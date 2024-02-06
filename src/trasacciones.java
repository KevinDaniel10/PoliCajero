import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trasacciones{
    public JPanel tranpanel;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depósitoRadioButton;
    private JRadioButton salirRadioButton;


    //Creacion de una variable estatica para almacenar el saldo y modificarlo
    static double dinero=500;

    public trasacciones()  {
        //Boton para ver Saldo
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(retiroRadioButton);
                tranFrame.dispose();
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new Saldo(trasacciones.dinero).saldopanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setUndecorated(true);
                frame2.setVisible(true);
            }
        });

        //Boton para ver retiro
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(retiroRadioButton);
                tranFrame.dispose();
                JFrame frame2 = new JFrame("Pantalla");
                //Abrir frame 2 pero con la funcionalidad de la variable estatica
                frame2.setContentPane(new retiro(trasacciones.dinero).retiropanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setUndecorated(true);
                frame2.setVisible(true);
            }
        });
        //Boton para ver deposito
        depósitoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(depósitoRadioButton);
                tranFrame.dispose();
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new deposito(trasacciones.dinero).depositopanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setUndecorated(true);
                frame2.setVisible(true);
            }
        });
        //Boton para salir
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(salirRadioButton);
                tranFrame.dispose();
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new salir().spanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setUndecorated(true);
                frame2.setVisible(true);
            }
        });
    }
}
