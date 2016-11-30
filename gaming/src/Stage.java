/**
 * Created by HP on 11/11/2559.
 */
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import static java.awt.Color.getColor;
import static java.awt.SystemColor.text;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Stage {

    BufferedImage img = ImageIO.read(new File("C://pic//st1.jpg"));
    BufferedImage img2 = ImageIO.read(new File("C://pic//st2.jpg"));
    BufferedImage img3 = ImageIO.read(new File("C://pic//download.jpg"));

    private int width;
    private int height;

    JFrame frame = new JFrame();
    JLabel lbl = new JLabel();

    public Stage() throws IOException
    {
        height = img.getHeight();
        width = img.getWidth();
        ImageIcon icon = new ImageIcon(img);
        lbl.setIcon(icon);
        frame.setLayout(new FlowLayout());
        frame.setSize(width,height);
        frame.add(lbl,new Integer(0));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setTitle("Detect Ghost");
        frame.setResizable(true);
        frame.pack();
        frame.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("C://pic//pointer.png").getImage(),new Point(0,0),"custom cursor"));

    }

    public void ChangeStage2(){
        height = img.getHeight();
        width = img.getWidth();
        ImageIcon icon = new ImageIcon(img2);
        lbl.setIcon(icon);
        lbl.setBounds(1,1,width,height);
        frame.add(lbl, new Integer(1));

    };

    public void addItem(){
        ImageIcon icon2 = new ImageIcon(img3);
        JLabel lbl2 = new JLabel();
        lbl2.setIcon(icon2);

        JPanel panel1 = new JPanel();
        panel1.setBounds(1, 1, 200, 200);
        panel1.add(lbl2);
        frame.add(panel1, new Integer(2));

        /*JPanel panel3 = new JPanel();
        panel3.setBounds(20, 20, 300, 300);
        panel3.add(lbl);
        frame.add(panel3, new Integer(3));*/
    }

}
