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

    BufferedImage fampic1 = ImageIO.read(new File("familypic1.png"));
    BufferedImage fampic2 = ImageIO.read(new File("familypic2.png"));
    BufferedImage fampic3 = ImageIO.read(new File("familypic3.png"));
    BufferedImage calender = ImageIO.read(new File("calender.png")); //i15

    JButton botton2 = new JButton(new ImageIcon(fampic1));
    JButton botton15 = new JButton(new ImageIcon(calender));

    int x,y;

    Items2() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall2(JLayeredPane lp){
        botton2.setVisible(true);
        botton2.setOpaque(false);
        botton2.setContentAreaFilled(false);
        botton2.setFocusPainted(false);
        botton2.setBorder(BorderFactory.createEmptyBorder());
        botton2.setBounds(x,y,fampic1.getWidth(),fampic1.getHeight());
        botton2.addActionListener(new Items2.CustomActionListener());
        lp.add(botton2,new Integer(2));
    }

    public void ItemCall15(JLayeredPane lp){
        botton15.setVisible(true);
        botton15.setOpaque(false);
        botton15.setContentAreaFilled(false);
        botton15.setFocusPainted(false);
        botton15.setBorder(BorderFactory.createEmptyBorder());
        botton15.setBounds(x,y,calender.getWidth(),calender.getHeight());
        botton15.addActionListener(new Items2.CustomActionListener());
        lp.add(botton15,new Integer(2));
    }

    public void ChangePicState2(JLayeredPane lp){
            botton2.setIcon(new ImageIcon(fampic2));
        }

    public void ChangePicState3(JLayeredPane lp){
            botton2.setIcon(new ImageIcon(fampic3));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if(main.getState() == 2) {
                main.nextState();
            }else if(main.getState3() == 0){
                main.nextState3();
            }else if(main.getState4() == 0 ){
                main.nextState4();
            }
        }
    }
}
