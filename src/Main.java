import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Para mostrar el JFrame login setUndecorated se utiliza para eliminar la barra de maximizar y cerra
        JFrame frame = new JFrame("Cajero");
        Color color1=new Color(230,230,250);
        frame.setContentPane(new login().cajeropanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(color1);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}