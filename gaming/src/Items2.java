import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by HP on 7/12/2559.
 */
public class Items2 extends JComponent {

    BufferedImage fampic1 = ImageIO.read(new File("C://pic//room1//familypic1.png"));
    BufferedImage fampic2 = ImageIO.read(new File("C://pic//room1//familypic2.png"));
    BufferedImage fampic3 = ImageIO.read(new File("C://pic//room1//familypic3.png"));

    JButton botton = new JButton(new ImageIcon(fampic1));

    int x,y;

    Items2() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall(JLayeredPane lp){
        botton.setVisible(true);
        botton.setOpaque(false);
        botton.setContentAreaFilled(false);
        botton.setFocusPainted(false);
        botton.setBorder(BorderFactory.createEmptyBorder());
        botton.setBounds(x,y,fampic1.getWidth(),fampic1.getHeight());
        botton.addActionListener(new Items2.CustomActionListener());
        lp.add(botton,new Integer(2));

    }

    public void ChangePicState2(JLayeredPane lp){
        botton.setIcon(new ImageIcon(fampic2));
    }

    public void ChangePicState3(JLayeredPane lp){
        botton.setIcon(new ImageIcon(fampic3));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if(main.getState()>0) {
                main.nextState();
            }
        }
    }
}
