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
public class Items3 extends JComponent{
    BufferedImage note1 = ImageIO.read(new File("noteInLivingroom.png")); //i4

    JButton botton = new JButton(new ImageIcon(note1));

    int x,y;

    Items3() throws IOException {
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
        botton.setBounds(x,y,note1.getWidth(),note1.getHeight());
        botton.addActionListener(new Items3.CustomActionListener());
        lp.add(botton,new Integer(3));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if(main.getState() == 1) {
                main.nextState();
            }
        }
    }

}
