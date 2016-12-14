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
public class Items4 extends JComponent {

    BufferedImage blood = ImageIO.read(new File("blood.png"));  //i6
    BufferedImage ghost1 = ImageIO.read(new File("ghost.png"));  //i10
    BufferedImage crackedW = ImageIO.read(new File("crackedDisplay.png")); //i14

    JButton botton6 = new JButton(new ImageIcon(blood));
    JButton botton10 = new JButton(new ImageIcon(ghost1));
    JButton botton14 = new JButton(new ImageIcon(crackedW));

    int x,y;

    Items4() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }


    public void ItemCall6(JLayeredPane lp){
        botton6.setVisible(true);
        botton6.setOpaque(false);
        botton6.setContentAreaFilled(false);
        botton6.setFocusPainted(false);
        botton6.setBorder(BorderFactory.createEmptyBorder());
        botton6.setBounds(x,y,blood.getWidth(),blood.getHeight());
        botton6.addActionListener(new Items4.CustomActionListener());
        lp.add(botton6,new Integer(2));
    }

    public void ItemCall10(JLayeredPane lp){
        botton10.setVisible(true);
        botton10.setOpaque(false);
        botton10.setContentAreaFilled(false);
        botton10.setFocusPainted(false);
        botton10.setBorder(BorderFactory.createEmptyBorder());
        botton10.setBounds(x,y,ghost1.getWidth(),ghost1.getHeight());
        botton10.addActionListener(new Items4.CustomActionListener());
        lp.add(botton10,new Integer(2));
    }

    public void ItemCall14(JLayeredPane lp){
        botton14.setVisible(true);
        botton14.setOpaque(false);
        botton14.setContentAreaFilled(false);
        botton14.setFocusPainted(false);
        botton14.setBorder(BorderFactory.createEmptyBorder());
        botton14.setBounds(x,y,crackedW.getWidth(),crackedW.getHeight());
        botton14.addActionListener(new Items4.CustomActionListener());
        lp.add(botton14,new Integer(3));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if( main.getState2() == 3) {
                main.nextState2();
            }else if ( main.getState3() == 4 || main.getState3() == 3 ){
                main.nextState3();
            }
        }
    }

}
