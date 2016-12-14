import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Pair on 14/12/2559.
 */
public class Items6 extends JComponent{
    BufferedImage chair = ImageIO.read(new File("chair1.png")); //i16
    BufferedImage chair1 = ImageIO.read(new File("chair2.png"));

    JButton botton16 = new JButton(new ImageIcon(chair));

    int x,y;

    Items6() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall16(JLayeredPane lp){
        botton16.setVisible(true);
        botton16.setOpaque(false);
        botton16.setContentAreaFilled(false);
        botton16.setFocusPainted(false);
        botton16.setBorder(BorderFactory.createEmptyBorder());
        botton16.setBounds(x,y,chair.getWidth(),chair.getHeight());
        botton16.addActionListener(new Items6.CustomActionListener());
        lp.add(botton16,new Integer(2));
    }

    public void ChangePicState5(JLayeredPane lp){
        botton16.setIcon(new ImageIcon(chair1));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if( main.getState4() == 1 ){
                main.nextState4();
            }
        }
    }

}
