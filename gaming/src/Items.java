import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by HP on 12/11/2559.
 */
public class Items extends JComponent{

    BufferedImage ball = ImageIO.read(new File("C://pic//ball55.png"));

    JButton botton = new JButton(new ImageIcon(ball));

    Items() throws IOException {
    }


    public void Item1(JLayeredPane lp){
        // Panel 2
        /*addMouseListener(listener);
        JLabel lbl2 = new JLabel();
        ImageIcon icon2 = new ImageIcon(ball);
        lbl2.setIcon(icon2);
        JPanel panel2 = new JPanel();
        panel2.setBounds(400,200,ball.getWidth(),ball.getHeight());
        panel2.setOpaque(false);
        panel2.add(lbl2);
        lp.add(panel2,new Integer(2));
        */
        botton.setVisible(true);
        botton.setOpaque(false);
        botton.setContentAreaFilled(false);
        botton.setFocusPainted(false);
        botton.setBorder(BorderFactory.createEmptyBorder());
        botton.setBounds(400,200,ball.getWidth(),ball.getHeight());
        botton.addActionListener(new CustomActionListener());
        lp.add(botton,new Integer(2));

        // Panel 3
        /*JPanel panel3 = new JPanel();
        panel3.setBounds(80,140,187,109);
        panel3.setBorder(BorderFactory.createTitledBorder("Panel 3"));
        panel3.add(new JLabel("Label 5"));
        panel3.add(new JLabel("Label 6"));
        layeredPane.add(panel3,new Integer(3));*/

    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            main.nextState();
        }
    }

}
