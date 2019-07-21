/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author orlando
 */
public class Figura extends JFrame implements ActionListener, KeyListener{

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
       
       arriba = new JButton ();
       arriba.setIcon(new ImageIcon(getClass().getResource("/Recursos/btamarillo.png") ));
       arriba.setBounds(800, 550, 130, 80);
       frame.getContentPane().add(arriba);
       arriba.setVisible(true);
       arriba.addActionListener(this);
       arriba.addKeyListener(this);
      
       lblflf = new JLabel(" ENCAJE LAS FIGURAS  ");
       lblflf.setBounds(400, 60, 1000, 100);
       lblflf.setVisible(true);
       lblflf.setFont(new java.awt.Font("Century Gothic", 0, 35));
       frame.getContentPane().add(lblflf);
     
      
       abajo1 = new JButton ();
       abajo1.setIcon(new ImageIcon(getClass().getResource("/Recursos/btverde.png") ));
       abajo1.setBounds(680, 550, 130, 80);
       frame.getContentPane().add(abajo1);
       abajo1.setVisible(true);
       abajo1.addActionListener(this);
       abajo1.addKeyListener(this);

       derecha1 = new JButton ();
       derecha1.setIcon(new ImageIcon(getClass().getResource("/Recursos/btazul.png") ));
       derecha1.setBounds(550, 550, 130, 80);
       frame.getContentPane().add(derecha1);
       derecha1.setVisible(true);
       derecha1.addActionListener(this);
       derecha1.addKeyListener(this);

       izquierda1 = new JButton ();
       izquierda1.setIcon(new ImageIcon(getClass().getResource("/Recursos/btrojo.png") ));
       izquierda1.setBounds(420, 550, 130, 80);
       frame.getContentPane().add(izquierda1);
       izquierda1.setVisible(true);
       izquierda1.addActionListener(this);
       izquierda1.addKeyListener(this);
       
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
