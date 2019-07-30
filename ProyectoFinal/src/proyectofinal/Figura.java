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
import java.util.logging.Level;
import java.util.logging.Logger;
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
       
       imagen = new JLabel ();
       imagen.setIcon(new ImageIcon(getClass().getResource("/Recursos/hh.png")));
       imagen.setBounds(200, 100, 157, 160);
       frame.getContentPane().add(imagen);
       imagen.setVisible(true);
      
        imagen2 = new JLabel ();
       imagen2.setIcon(new ImageIcon(getClass().getResource("/Recursos/cc.png")));
       imagen2.setBounds(200, 100, 200, 200);
       frame.getContentPane().add(imagen2);
       imagen2.setVisible(false);
       
       p = new JLabel ();
       p.setIcon(new ImageIcon(getClass().getResource("/Recursos/cd.jpg")));
       p.setBounds(1100, 150, 200, 200);
       frame.getContentPane().add(p);
       p.setVisible(false);
       
       con = new JLabel ();
       con.setIcon(new ImageIcon(getClass().getResource("/Recursos/4.png")));
       con.setBounds(10, 350, 150, 160);
       frame.getContentPane().add(con);
       con.setVisible(true);
       
        cv = new JLabel();
        cv.setBounds(1200,350, 150, 150);
        cv.setIcon(new ImageIcon(getClass().getResource("/Recursos/fv.png")));
        frame.getContentPane().add(cv);
        cv.setVisible(false);
        
        
        ventanaEmergente = new JFrame();
        ventanaEmergente.setTitle("Instrucción");
        ventanaEmergente.setLocation(450, 150);
        ventanaEmergente.setSize(501, 500);
        ventanaEmergente.setLayout(null);
        ventanaEmergente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        lblimg= new JLabel();
        lblimg.setIcon(new ImageIcon(getClass().getResource("/Recursos/encajarFigura.jpg")));
        lblimg.setBounds(0, 0, 501, 500);
        ventanaEmergente.getContentPane().add(lblimg);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(180, 350, 110,50);
        btnAceptar.addActionListener(this);
        ventanaEmergente.getContentPane().add(btnAceptar);;
        
        vf = new JFrame();
        vf.setTitle("");
        vf.setLocation(450, 150);
        vf.setSize(501, 500);
        vf.setLayout(null);
        vf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        vf.setVisible(false);
        
        vff= new JLabel();
        vff.setIcon(new ImageIcon(getClass().getResource("/Recursos/fin.png")));
        vff.setBounds(0, 0, 501, 500);
        vf.getContentPane().add(vff);
        
        
        
        vf2 = new JFrame();
        vf2.setTitle("");
        vf2.setLocation(450, 150);
        vf2.setSize(501, 500);
        vf2.setLayout(null);
        vf2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        vf2.setVisible(false);
        
        boton = new JButton("Aceptar");
        boton.setBounds(180, 350, 110,50);
        boton.addActionListener(this);
        vf.getContentPane().add(boton);
        
        bt2 = new JButton("Aceptar");
        bt2.setBounds(180, 350, 110,50);
        bt2.addActionListener(this);
        vf.getContentPane().add(bt2);
        
        
        vff2= new JLabel();
        vff2.setIcon(new ImageIcon(getClass().getResource("/Recursos/HG.png")));
        vff2.setBounds(0, 0, 501, 500);
        vf2.getContentPane().add(vff2);
        
   
       frame.setVisible(true);
       
        reloj = new Timer (80,new ActionListener() 
       {
           
           @Override
           public void actionPerformed(ActionEvent e) 
           {
           
             switch (tecla)
                {
                    case 1:
                        y=y-5;
                        
                    break;
                    case 2:
                        y=y+5;
                        
                    break;
                    case 3:
                        x=x+5;
                        
                    break;
                    case 4:
                        x=x-5;
                        
                    break;    
                } 
             
            imagen.setLocation(x, y);
            imagen2.setLocation(x, y);
                
            if(x<=15&&x>=5&&y<=355&&y>=345)
            {
                reloj.stop();
                x=200; y=100;
                con.setVisible(false);
                imagen.setVisible(false);
                imagen2.setVisible(true);
                m.setVisible(true);
                cv.setVisible(true);
               
                p.setVisible(true);
                imagen2.setLocation(x, y);
                vf2.setVisible(false);
            
             }
            if(x<=1105&&x>=1095&&y<=150&&y>=125)
            {
            reloj.stop();
            
            m.setVisible(true);
            cv.setVisible(true);
          
            v=false;
            vf.setVisible(true);
            
           
            }
           
            }
         
       }); 
       
       
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
      if(e.getSource()==btnAceptar)
        {   ventanaEmergente.setVisible(false);     }
        if(e.getSource()==boton)
        {   
            vf.dispose();
            frame.dispose();
        }
        
        if (e.getSource()==arriba)
        {
            m.setVisible(false);
            tecla=1;
            reloj.start();
            lblflf.setVisible(false);
            
            v=true;
        }  
        if (e.getSource()==abajo1)
        {
            m.setVisible(false);
            reloj.start();
            tecla=2;
            lblflf.setVisible(false);
            
            v=true;
        } 
        if (e.getSource()==derecha1)
        { 
            
           m.setVisible(false);
            reloj.start();
            tecla=3;
            lblflf.setVisible(false);
            
            v=true;
           
        } 
        if (e.getSource()==izquierda1)
        {
            m.setVisible(false);
            reloj.start();
            lblflf.setVisible(false);
            tecla=4;
            
            v=true;
        }
        if(e.getSource()==pause){
           
            Proyecto a = new Proyecto ();
            try {
              
                
            } catch (Exception ex) {
                Logger.getLogger(Figura.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.dispose();
            
        }
        if(e.getSource()==pause1){
           System.exit(0);
            
        }
            
         }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    if (e.getKeyCode()==KeyEvent.VK_UP)
        {
            m.setVisible(false);
            tecla=1;
            reloj.start();
            lblflf.setVisible(false);
            
            v=true;
        }  
        if (e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            m.setVisible(false);
            reloj.start();
            tecla=2;
            lblflf.setVisible(false);
            
            v=true;
        } 
        if (e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            
           m.setVisible(false);
            reloj.start();
            tecla=3;
            lblflf.setVisible(false);
            
            v=true;
           
        } 
        if (e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            m.setVisible(false);
            reloj.start();
            tecla=4;
            lblflf.setVisible(false);
            
            v=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
