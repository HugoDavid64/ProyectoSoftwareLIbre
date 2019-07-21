/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author orlando
 */
public abstract class Figura extends JFrame implements ActionListener{
    
    Timer reloj, reloj2;
    JFrame frame;
    JLabel imagen,imagen2,p,p1,m,con,q,cv,lblflf,f;
    JButton arriba, abajo1, izquierda1, derecha1, pause,pause1;
    boolean v=true;
    int tecla, x=200, y=100,cont=0,cont2=0;
    int key;
    
    JFrame ventanaEmergente,vf,vf2;
    JButton btnAceptar,boton,bt2;
    JLabel lblimg,vff,vff2;
    
    public void ventana(){
        
       frame = new JFrame ();
       frame.setBounds(10, 10, 1400, 800);
       frame.setLocation(0, 0);
       frame.setLayout(null);
       frame.getContentPane().setBackground(Color.GRAY);
        
       m = new JLabel (" Bien ");
       m.setBounds(1200, -250, 500, 700);
       frame.getContentPane().add(m);
       m.setVisible(false);
       
       q = new JLabel ();
       q.setBounds(400, 150, 100, 20);
       frame.getContentPane().add(q);
      
       pause = new JButton("  Reiniciar >>> ");
       pause.setBounds(975, 640, 200, 50);
       pause.addActionListener(this);
       pause.setVisible(true);
       pause.setFont(new java.awt.Font("Century Gothic", 0, 15));
       frame.getContentPane().add(pause);
        
       f = new JLabel ();
       f.setSize(501, 500);
       f.setIcon(new ImageIcon(getClass().getResource("/Recursos/fin.png") ));
       frame.getContentPane().add(f);
       f.setVisible(false);
        
       pause1 = new JButton("  Fin >>> ");
       pause1.setBounds(1200, 640, 100, 50);
       pause1.addActionListener(this);
       pause1.setVisible(true);
       pause1.setFont(new java.awt.Font("Century Gothic", 0, 15));
       frame.getContentPane().add(pause1);
       
    }
    
}
