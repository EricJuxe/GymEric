/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogym;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Eric Juárez
 */
public class Login2 extends JFrame{
    public Login2(){
        super("GYM");
        this.setType(Type.UTILITY);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       
        JPanel todo= new JPanel();       
        todo.setLayout(new BorderLayout());
        
        JPanel titulo= new JPanel();
        titulo.setLayout(new FlowLayout());
        ImageIcon pesa= new ImageIcon("/img/pesa1.png");
        JLabel l= new JLabel(pesa);
        ImageIcon pesa1= new ImageIcon("/img/pesa2.png");
        JLabel l2= new JLabel(pesa1);
        JLabel Gymeric= new JLabel("GymEric");

        titulo.add(l);
        titulo.add(Gymeric);
        titulo.add(l2);
        
        JPanel centro= new JPanel();
        
        
        todo.add(centro,BorderLayout.CENTER);                
        todo.add(titulo,BorderLayout.NORTH);
        this.add(todo);
        
    }
    
    
    public static void main(String [] args){
        Login2 LL=new Login2();
    }
    
}
