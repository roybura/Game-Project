import javafx.stage.Stage;

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
    BufferedImage note1 = ImageIO.read(new File("noteInLivingroom.png")); //i3
    BufferedImage note2 = ImageIO.read(new File("note.png"));  //i7 not open
    BufferedImage car = ImageIO.read(new File("car.png")); //i12
    BufferedImage ghost2 = ImageIO.read(new File("ghostwithrope.png")); //i20


    JButton botton3 = new JButton(new ImageIcon(note1));
    JButton botton7 = new JButton(new ImageIcon(note2));
    JButton botton12 = new JButton(new ImageIcon(car));
    JButton botton20 = new JButton(new ImageIcon(ghost2));


    int x,y;

    Items3() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall3(JLayeredPane lp){
        botton3.setVisible(true);
        botton3.setOpaque(false);
        botton3.setContentAreaFilled(false);
        botton3.setFocusPainted(false);
        botton3.setBorder(BorderFactory.createEmptyBorder());
        botton3.setBounds(x,y,note1.getWidth(),note1.getHeight());
        botton3.addActionListener(new Items3.CustomActionListener());
        lp.add(botton3,new Integer(3));
    }

    public void ItemCall7(JLayeredPane lp){
        botton7.setVisible(true);
        botton7.setOpaque(false);
        botton7.setContentAreaFilled(false);
        botton7.setFocusPainted(false);
        botton7.setBorder(BorderFactory.createEmptyBorder());
        botton7.setBounds(x,y,note2.getWidth(),note2.getHeight());
        botton7.addActionListener(new Items3.CustomActionListener());
        lp.add(botton7,new Integer(2));
    }

    public void ItemCall12(JLayeredPane lp){
        botton12.setVisible(true);
        botton12.setOpaque(false);
        botton12.setContentAreaFilled(false);
        botton12.setFocusPainted(false);
        botton12.setBorder(BorderFactory.createEmptyBorder());
        botton12.setBounds(x,y,car.getWidth(),car.getHeight());
        botton12.addActionListener(new Items3.CustomActionListener());
        lp.add(botton12,new Integer(2));
    }

    public void ItemCall20(JLayeredPane lp){
        botton20.setVisible(true);
        botton20.setOpaque(false);
        botton20.setContentAreaFilled(false);
        botton20.setFocusPainted(false);
        botton20.setBorder(BorderFactory.createEmptyBorder());
        botton20.setBounds(x,y,ghost2.getWidth(),ghost2.getHeight());
        botton20.addActionListener(new Items3.CustomActionListener());
        lp.add(botton20,new Integer(3));
    }



    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if( main.getState() == 1  ) {
                main.nextState();
            }
            else if ( main.getState2() == 1 || main.getState2() == 2 ||main.getState2() == 3 ){
                main.nextState2();
            }else if (main.getState3() == 1 ){
                main.nextState3();
            }else if (main.getState4() == 3) {
                main.nextState4();
            }
        }

    }

}


