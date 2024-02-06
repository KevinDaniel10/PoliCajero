import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Objects;

public class login {
    private JPasswordField display;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ingresarButton;
    private JButton borrarButton;
    private JButton corregirButton;
    public JPanel cajeropanel;
    private JButton a1Button;

    public login() {

        //Asignacion de los botones con un Jlabel llamado display
        // que guarda la informacion y la va almacenando
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a0Button.getText());
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Contraseña por Defaul

                String contra = "1234";
                try {
                    if (Objects.equals(display.getText(), contra)) {
                        JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(ingresarButton);
                        loginFrame.dispose();
                        JFrame frame2 = new JFrame("Pantalla");
                        frame2.setContentPane(new trasacciones().tranpanel);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.setSize(450, 450);
                        frame2.setLocationRelativeTo(null);
                        frame2.setUndecorated(true);
                        frame2.setVisible(true);
                    } else {
                        throw new Exception("Contraseña incorrecta");
                    }
                } catch (Exception E) {
                    if (display.getText().length() != 4) {
                        // Crear un objeto JOptionPane
                        JOptionPane optionPane = new JOptionPane("La contraseña debe tener 4 caracteres", JOptionPane.ERROR_MESSAGE);

                        // Modificar el tamaño del cuadro de diálogo
                        optionPane.setPreferredSize(new Dimension(450, 450));

                        // Mostrar el cuadro de diálogo
                        JDialog dialog = optionPane.createDialog("Error");
                        dialog.setResizable(false);
                        dialog.setVisible(true);
                        display.setText("");
                    } else {
                        // Si la contraseña tiene 4 caracteres pero no coincide, muestra la pantalla de inicio de sesión incorrecta
                        JFrame frame2 = new JFrame("Pantalla");
                        frame2.setContentPane(new ci().cipanel);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.setSize(450, 450);
                        frame2.setLocationRelativeTo(null);
                        frame2.setUndecorated(true);
                        frame2.setVisible(true);
                    }
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Borrar caracter por caracter del display

                String backspace = null;

                if (display.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(display.getText());
                    strB.deleteCharAt(display.getText().length() -1);
                    backspace= String.valueOf(strB);
                    display.setText(backspace);
                }

            }
        });
        corregirButton.addActionListener(new ActionListener() {
            //Borra todo del display
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
    }
}
