import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiro {
    public JPanel retiropanel;
    private JTextField displayr;
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

    public retiro(double dinero) {
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
                JFrame retFrame = (JFrame) SwingUtilities.getWindowAncestor(menuButton);
                retFrame.dispose();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText(displayr.getText()+a0Button.getText());
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //modificamos la variable estatica dinero restando el retiro con sus debidas exepciones
                double retiro = Double.parseDouble(displayr.getText());
                if(retiro>trasacciones.dinero){
                    JOptionPane optionPane = new JOptionPane("Saldo insuficiente", JOptionPane.ERROR_MESSAGE);

                    // Modificar el tamaño del cuadro de diálogo
                    optionPane.setPreferredSize(new Dimension(450, 450));

                    // Mostrar el cuadro de diálogo
                    JDialog dialog = optionPane.createDialog("Error");
                    dialog.setResizable(false);
                    dialog.setVisible(true);
                    displayr.setText("");
                }else {
                    System.out.println(displayr.getText());
                    System.out.println(dinero);
                    trasacciones.dinero -= retiro;
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
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String backspace = null;

                if (displayr.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(displayr.getText());
                    strB.deleteCharAt(displayr.getText().length() -1);
                    backspace= String.valueOf(strB);
                    displayr.setText(backspace);
                }

            }
        });
        corregirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayr.setText("");
            }
        });
    }
}
