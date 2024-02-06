import com.sun.org.apache.xpath.internal.operations.String;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    public JPanel saldopanel;
    private JButton menuButton;
    public JLabel capital;
    private JButton actualizarButton;

    private String dato;


    public Saldo(double dinero){
        //modificamos capital con el valor que tengamos en la variable estatica
        capital.setText(java.lang.String.valueOf(trasacciones.dinero));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new trasacciones().tranpanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setUndecorated(true);
                frame2.setVisible(true);
                JFrame saldoFrame = (JFrame) SwingUtilities.getWindowAncestor(menuButton);
                saldoFrame.dispose();
            }
        });
    }
}

