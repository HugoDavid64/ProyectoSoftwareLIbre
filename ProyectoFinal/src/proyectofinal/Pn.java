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
    
    
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
