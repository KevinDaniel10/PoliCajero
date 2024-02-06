import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class salir {
    private JButton aceptarButton;
    public JPanel spanel;

    public salir() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame[] frames = Frame.getFrames();

                // Cerrar cada frame
                for (Frame frame : frames) {
                    frame.dispose();
                }
            }
        });
    }
}
