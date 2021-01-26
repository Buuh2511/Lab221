/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Admin
 */
public class Table extends JFrame{
    JFrame f;  
    public Table() {
        initComponents();
    }
    void initComponents() {
    f=new JFrame();  
    f.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton btnRed=new JButton();
    JTextArea text = new JTextArea();
      //-------------
    btnRed.setBackground(Color.red);
    btnRed.setPreferredSize(new java.awt.Dimension(72, 32));
    f.add(btnRed);
    btnRed.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
                text.setBackground(new java.awt.Color(255, 0, 51));
            }
    });
    //-------
    JButton btnGreen=new JButton();
    btnGreen.setBackground(Color.green);
    btnGreen.setPreferredSize(new java.awt.Dimension(72, 32));
    f.add(btnGreen);
    btnGreen.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
                text.setBackground(new java.awt.Color(0, 204, 0));
            }
    });
    //--------
    JButton btnBlue=new JButton();  
    btnBlue.setBackground(Color.blue);
    btnBlue.setPreferredSize(new java.awt.Dimension(72, 32));
    f.add(btnBlue);
    btnBlue.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
                text.setBackground(new java.awt.Color(0, 0, 255));
            }
    });
    //--------
    JButton btnWhite=new JButton();
    btnWhite.setBackground(Color.white);
    btnWhite.setPreferredSize(new java.awt.Dimension(72, 32));
     f.add(btnWhite);
      btnWhite.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
                text.setBackground(new java.awt.Color(255, 255, 255));
            }
    });
      //------
      text.setPreferredSize(new java.awt.Dimension(350, 220));
      f.add(text);
       
    f.setSize(400, 310);  
    f.setVisible(true);  
    }
    
    
    public static void main(String[] args) {
       Table form = new Table();
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
}
}
