/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;

/**
 *
 * @author orlando
 */
public class Pn extends JFrame implements ActionListener{

    Timer tiempo;
    JMenu menAr, menBot;
    JMenuItem itSalir, itPlay, itParar;
    JMenuBar barra;
    JFrame ventanilla, ventana2, ventana3, v4, v5;
    JLabel cv, cr, p, j, f, d, lblflf;
    JButton r, a, v, amm, r2, a2, v2, amm2, r3, r5, a3, v3, amm3, r4, a4, ver4, amm4, pause;
    AudioClip sonido, sonido2;
    int velocidad, cont = 1, delayCont;
    
    JFrame ventanaEmergente,vf;
    JButton btnAceptar,boton;
    JLabel lblimg,vff;
    
    public void niños() {
    
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("son.wav"));
        sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("son1.wav"));
        ventanilla = new JFrame("Diferencie entre lo correcto e incorrecto ");
        ventanilla.setLocation(0, 0);
        ventanilla.setSize(1400, 1000);
        ventanilla.getContentPane().setBackground(Color.gray);
        ventanilla.setLayout(null);
        ventanilla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblflf = new JLabel(" DIFERENCIE ENTRE LO CORRECTO E INCORRECTO ");
        lblflf.setBounds(220, 20, 1000, 100);
        lblflf.setVisible(true);
        lblflf.setFont(new java.awt.Font("Century Gothic", 0, 35));
        ventanilla.getContentPane().add(lblflf);

        pause = new JButton("  Reiniciar >>> ");
        pause.setBounds(1000, 600, 200, 50);
        pause.addActionListener(this);
        pause.setVisible(true);
        pause.setFont(new java.awt.Font("Century Gothic", 0, 15));
        ventanilla.getContentPane().add(pause);
    
        r = new JButton();
        r.addActionListener(this);
        r.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r);

        v = new JButton("");
        v.addActionListener(this);
        v.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v);
        
        
        
          // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);  // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);
    // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);
        
        
        
        
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
