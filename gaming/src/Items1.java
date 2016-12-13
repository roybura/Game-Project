import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Pair on 13/12/2559.
 */
public class Items1 extends JComponent {

    BufferedImage startpush = ImageIO.read(new File("startpush.png")); //i0
    BufferedImage clock = ImageIO.read(new File("clock.png"));  //i3
    BufferedImage picmesseges = ImageIO.read(new File("messeges.png")); //i1


    JButton botton = new JButton(new ImageIcon(startpush));
    JButton botton2 = new JButton(new ImageIcon(clock));
    JButton botton3 = new JButton(new ImageIcon(picmesseges));

    int x,y;

    Items1() throws IOException {
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
        botton.setBounds(x,y,startpush.getWidth(),startpush.getHeight());
        botton.addActionListener(new Items1.CustomActionListener());
        lp.add(botton,new Integer(2));
    }

    public void ItemCall2(JLayeredPane lp){
        botton2.setVisible(true);
        botton2.setOpaque(false);
        botton2.setContentAreaFilled(false);
        botton2.setFocusPainted(false);
        botton2.setBorder(BorderFactory.createEmptyBorder());
        botton2.setBounds(x,y,clock.getWidth(),clock.getHeight());
        botton2.addActionListener(new Items1.CustomActionListener());
        lp.add(botton2,new Integer(2));
    }

    public void ItemCall3(JLayeredPane lp){
        botton3.setVisible(true);
        botton3.setOpaque(false);
        botton3.setContentAreaFilled(false);
        botton3.setFocusPainted(false);
        botton3.setBorder(BorderFactory.createEmptyBorder());
        botton3.setBounds(x,y,picmesseges.getWidth(),picmesseges.getHeight());
        botton3.addActionListener(new Items1.CustomActionListener());
        lp.add(botton3,new Integer(2));
    }


    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if(main.getState() == -1|| main.getState() == 0 || main.getState() == 3 ) {
                main.nextState();
            }
        }
    }




}
