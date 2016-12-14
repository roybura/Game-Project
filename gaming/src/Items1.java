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
    BufferedImage picmesseges = ImageIO.read(new File("messeges.png")); //i1
    BufferedImage bottle = ImageIO.read(new File("toxicbottles.png"));  //i5
    BufferedImage note3 = ImageIO.read(new File("goodbye letter.png"));  //i9
    BufferedImage robot = ImageIO.read(new File("robot1.png")); //i11
    BufferedImage robot2 = ImageIO.read(new File("robot2.png")); //
    BufferedImage doll = ImageIO.read(new File("doll.png")); //i17
    BufferedImage mirror2 = ImageIO.read(new File("shadowwithmirror.png")); //i19


    JButton botton0 = new JButton(new ImageIcon(startpush));
    JButton botton1 = new JButton(new ImageIcon(picmesseges));
    JButton botton5 = new JButton(new ImageIcon(bottle));
    JButton botton9 = new JButton(new ImageIcon(note3));
    JButton botton11 = new JButton(new ImageIcon(robot));
    JButton botton17 = new JButton(new ImageIcon(doll));
    JButton botton19 = new JButton(new ImageIcon(mirror2));


    int x,y;

    Items1() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall0(JLayeredPane lp){
        botton0.setVisible(true);
        botton0.setOpaque(false);
        botton0.setContentAreaFilled(false);
        botton0.setFocusPainted(false);
        botton0.setBorder(BorderFactory.createEmptyBorder());
        botton0.setBounds(x,y,startpush.getWidth(),startpush.getHeight());
        botton0.addActionListener(new Items1.CustomActionListener());
        lp.add(botton0,new Integer(2));
    }


    public void ItemCall1(JLayeredPane lp){
        botton1.setVisible(true);
        botton1.setOpaque(false);
        botton1.setContentAreaFilled(false);
        botton1.setFocusPainted(false);
        botton1.setBorder(BorderFactory.createEmptyBorder());
        botton1.setBounds(x,y,picmesseges.getWidth(),picmesseges.getHeight());
        botton1.addActionListener(new Items1.CustomActionListener());
        lp.add(botton1,new Integer(2));
    }

    public void ItemCall5(JLayeredPane lp){
        botton5.setVisible(true);
        botton5.setOpaque(false);
        botton5.setContentAreaFilled(false);
        botton5.setFocusPainted(false);
        botton5.setBorder(BorderFactory.createEmptyBorder());
        botton5.setBounds(x,y,bottle.getWidth(),bottle.getHeight());
        botton5.addActionListener(new Items1.CustomActionListener());
        lp.add(botton5,new Integer(2));
    }

    public void ItemCall9(JLayeredPane lp){
        botton9.setVisible(true);
        botton9.setOpaque(false);
        botton9.setContentAreaFilled(false);
        botton9.setFocusPainted(false);
        botton9.setBorder(BorderFactory.createEmptyBorder());
        botton9.setBounds(x,y,note3.getWidth(),note3.getHeight());
        botton9.addActionListener(new Items1.CustomActionListener());
        lp.add(botton9,new Integer(3));
    }

    public void ItemCall11(JLayeredPane lp){
        botton11.setVisible(true);
        botton11.setOpaque(false);
        botton11.setContentAreaFilled(false);
        botton11.setFocusPainted(false);
        botton11.setBorder(BorderFactory.createEmptyBorder());
        botton11.setBounds(x,y,robot.getWidth(),robot.getHeight());
        botton11.addActionListener(new Items1.CustomActionListener());
        lp.add(botton11,new Integer(2));
    }

    public void ItemCall17(JLayeredPane lp){
        botton17.setVisible(true);
        botton17.setOpaque(false);
        botton17.setContentAreaFilled(false);
        botton17.setFocusPainted(false);
        botton17.setBorder(BorderFactory.createEmptyBorder());
        botton17.setBounds(x,y,doll.getWidth(),doll.getHeight());
        botton17.addActionListener(new Items1.CustomActionListener());
        lp.add(botton17,new Integer(2));
    }

    public void ItemCall19(JLayeredPane lp){
        botton19.setVisible(true);
        botton19.setOpaque(false);
        botton19.setContentAreaFilled(false);
        botton19.setFocusPainted(false);
        botton19.setBorder(BorderFactory.createEmptyBorder());
        botton19.setBounds(x,y,mirror2.getWidth(),mirror2.getHeight());
        botton19.addActionListener(new Items1.CustomActionListener());
        lp.add(botton19,new Integer(3));
    }

    public void ChangePicState4(JLayeredPane lp){
        botton11.setIcon(new ImageIcon("robot2.png"));
    }


    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if(main.getState() == -1|| main.getState() == 0 ||main.getState() == 4 ){
                main.nextState();
            }else if(main.getState2() == 0 || main.getState2() == 2 || main.getState2() == 3 ){
                main.nextState2();
            }else if (main.getState3() == 0 ||main.getState3() == 2 ){
                main.nextState3();
            }else if (main.getState4() == 2){
                main.nextState4();
            }

        }
    }




}
