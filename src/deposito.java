import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class deposito  {
    public JPanel depositopanel;
    public JTextField displayd;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ingresarButton;
    private JButton borrarButton;
    private JButton corregirButton;
    private JButton a7Button;
    private JButton a1Button;
    private JButton menuButton;



    public deposito(double dinero) {
        //boton para volver al menu de trassaciones
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
                JFrame depFrame = (JFrame) SwingUtilities.getWindowAncestor(menuButton);
                depFrame.dispose();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                displayd.setText(displayd.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText(displayd.getText()+a0Button.getText());
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //modificamos la variable estatica dinero sumando el deposito
                double deposito = Double.parseDouble(displayd.getText());
                trasacciones.dinero += deposito;
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(ingresarButton);
                tranFrame.dispose();
                JFrame frame3 = new JFrame("Pantalla");
                frame3.setContentPane(new trasacciones().tranpanel);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setSize(450, 450);
                frame3.setLocationRelativeTo(null);
                frame3.setUndecorated(true);
                frame3.setVisible(true);
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String backspace = null;

                if (displayd.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(displayd.getText());
                    strB.deleteCharAt(displayd.getText().length() -1);
                    backspace= String.valueOf(strB);
                    displayd.setText(backspace);
                }

            }
        });
        corregirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayd.setText("");
            }
        });
    }
}
