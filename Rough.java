/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hksingh4343
 */
public class Rough {
    int j=0,k=0,x=0,m=0;

    JFrame f = new JFrame(" Rough ");
    JPanel[] p =new JPanel[4];
    int[] a = new int[4];
    

    JLabel[] l1,l2,l3,l4;
    JButton b1 = new JButton("rough");
    JButton b2 = new JButton("rough");
    JButton b3 = new JButton("rough");
    JButton b4 = new JButton("rough");
    Rough(){
    for(int po=0 ; po<4 ; po++)
    {a[po] = (int )(Math.random() * 5 + 1);}
    l1 =new JLabel[a[0]];
    l2 =new JLabel[a[1]];
    l3 =new JLabel[a[2]];
    l4 =new JLabel[a[3]];
    
    for(int yu=0; yu<4;yu++){
        p[yu]=new JPanel();
    }
        
        
    b1.setBounds(600, 10, 80, 30);
    b2.setBounds(600, 60, 80, 30);
    b3.setBounds(600, 110, 80, 30);
    b4.setBounds(600, 160, 80, 30);
    
    
    p[0].setBounds(5, 5,500,50); 
    //p[0].setBackground(Color.gray);
    p[0].setLayout(new FlowLayout(FlowLayout.RIGHT));
    p[1].setBounds(5, 60,500,50); 
   // p[1].setBackground(Color.gray);
    p[1].setLayout(new FlowLayout(FlowLayout.RIGHT));
    p[2].setBounds(5, 120,500,50); 
   // p[2].setBackground(Color.gray);
    p[2].setLayout(new FlowLayout(FlowLayout.RIGHT));
    p[3].setBounds(5, 180,500,50); 
    //p[3].setBackground(Color.gray);
    p[3].setLayout(new FlowLayout(FlowLayout.RIGHT));
    
    
    Icon ic11=new ImageIcon("/home/hksingh4343/Documents/1.jpg"); 
    Icon pic=new ImageIcon("/home/hksingh4343/Documents/2.jpg");
    //l.setIcon(ic11);
    
    for(int i=0;i<a[0];i++){
        l1[i]= new JLabel();
        //b[i].setEnabled(true);
        l1[i].setIcon(ic11);
        p[0].add(l1[i]);
    }
    
    for(int i=0;i<a[1];i++){
        l2[i]= new JLabel();
        //b[i].setEnabled(true);
        l2[i].setIcon(ic11);
        p[1].add(l2[i]);
    }
    
    for(int i=0;i<a[2];i++){
        l3[i]= new JLabel();
        //b[i].setEnabled(true);
        l3[i].setIcon(ic11);
        p[2].add(l3[i]);
    }
    
    for(int i=0;i<a[3];i++){
        l4[i]= new JLabel();
        //b[i].setEnabled(true);
        l4[i].setIcon(ic11);
        p[3].add(l4[i]);
    }
    
    
   // p.add(l);

    b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            l1[j].setIcon(pic);
            
            j++;        
    }  
    });
    
    b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            l2[j].setIcon(pic);
            
            k++;        
    }  
    });
    
    b3.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            l3[j].setIcon(pic);
            
            x++;        
    }  
    });
    
    b4.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            l4[j].setIcon(pic);
            
            m++;        
    }  
    });

    
    
    
    for(int u=0;u<4;u++){
        f.add(p[u]);
    }
    
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);
    f.setSize(800, 800);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Rough();
        // TODO code application logic here
    }
    
}

