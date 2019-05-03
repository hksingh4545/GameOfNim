/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hksingh4343
 */
public class Rough {
    int i=0;
    JFrame f = new JFrame(" Rough ");
    JPanel p = new JPanel();
    int a = (int )(Math.random() * 5 + 1);

    JButton[] b =new JButton[a];
    JButton b1 = new JButton("rough");
    Rough(){
        
    b1.setBounds(300, 10, 80, 30);
    p.setBounds(5, 5,250,50); 
    p.setBackground(Color.gray);
    
    Icon ic11=new ImageIcon("/home/hksingh4343/Documents/1.jpg"); 
    Icon pic=new ImageIcon("/home/hksingh4343/Documents/2.jpg");
    
    p.setLayout(new GridLayout(1,4));
    for(int i=0;i<a;i++){
        b[i]= new JButton();
        b[i].setEnabled(false);
        b[i].setIcon(ic11);
        p.add(b[i]);
    }
    

    b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            b[i].setIcon(pic);
            
            i++;
            
    }  
    }); 
    
    
    
    
    
    f.add(p);
    f.add(b1);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
    
    }
    public static void main(String[] args) {
        new Rough();
        // TODO code application logic here
    }
    
}

