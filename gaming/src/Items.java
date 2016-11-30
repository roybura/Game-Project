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

        botton.setVisible(true);
        botton.setOpaque(false);
        botton.setContentAreaFilled(false);
        botton.setFocusPainted(false);
        botton.setBorder(BorderFactory.createEmptyBorder());
        botton.setBounds(400,200,ball.getWidth(),ball.getHeight());
        botton.addActionListener(new CustomActionListener());
        lp.add(botton,new Integer(2));

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
