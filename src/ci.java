import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ci {
    private JButton aceptarButton;
    public JPanel cipanel;

    public ci() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new login().cajeropanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setUndecorated(true);
                frame2.setVisible(true);
                JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(aceptarButton);
                loginFrame.dispose();
            }
        });
    }
}
