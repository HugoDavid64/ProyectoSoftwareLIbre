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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author orlando
 */
public class Numeros extends JFrame implements ActionListener{
    
    JFrame ventanilla, v4, v5;
    JLabel p1, cv, cr, p2, p3, p4, g1, g2, g3, b, b2, soles, soles2, lblimgPremio, f, lblflf;
    JButton r, a, v, amm, r2, a2, v2, amm2, r3, r5, a3, v3, amm3, r4, a4, ver4, amm4, pause;
    AudioClip iupi,iupi2;

    JFrame ventanaEmergente,vf;
    JButton btnAceptar,boton;
    JLabel lblimg,vff;

    
    public void nume(){
          iupi = java.applet.Applet.newAudioClip(getClass().getResource("son.wav"));
        iupi2 = java.applet.Applet.newAudioClip(getClass().getResource("son1.wav"));

        ventanilla = new JFrame("CUENTA EL NUMERO DE OBJETOS");
        ventanilla.setLocation(0, 0);
        ventanilla.setSize(1400, 1000);
        ventanilla.getContentPane().setBackground(Color.gray);
        ventanilla.setLayout(null);
        ventanilla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pause = new JButton("  Regresar >>> ");
        pause.setBounds(1000, 600, 200, 50);
        pause.addActionListener(this);
        pause.setVisible(true);
        pause.setFont(new java.awt.Font("Century Gothic", 0, 15));
        ventanilla.getContentPane().add(pause);

        lblflf = new JLabel(" CUENTE EL NUMERO DE OBJETOS ");
        lblflf.setBounds(400, 60, 1000, 100);
        lblflf.setVisible(true);
        lblflf.setFont(new java.awt.Font("Century Gothic", 0, 35));
        ventanilla.getContentPane().add(lblflf);

        r = new JButton();
        r.addActionListener(this);
        r.setIcon(new ImageIcon(getClass().getResource("ro.png")));
        r.setBounds(50, 500, 100, 94);
        ventanilla.getContentPane().add(r);

        a = new JButton("");
        a.addActionListener(this);
        a.setBounds(200, 500, 100, 94);
        a.setIcon(new ImageIcon(getClass().getResource("az.png")));//ffffffffffffffffffffffalta imagen 
        ventanilla.getContentPane().add(a);

        amm = new JButton("");
        amm.addActionListener(this);
        amm.setIcon(new ImageIcon(getClass().getResource("am.png")));
        amm.setBounds(350, 500, 100, 94);
        ventanilla.getContentPane().add(amm);
        
         v = new JButton("");
        v.addActionListener(this);
        v.setIcon(new ImageIcon(getClass().getResource("ver2.png")));
        v.setBounds(500, 500, 100, 94);
        ventanilla.getContentPane().add(v);

        // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("ro.png")));
        r2.setBounds(50, 500, 100, 94);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        a2 = new JButton("");
        a2.addActionListener(this);
        a2.setBounds(200, 500, 100, 94);
        a2.setIcon(new ImageIcon(getClass().getResource("az.png")));
        ventanilla.getContentPane().add(a2);
        a2.setVisible(false);

        amm2 = new JButton("");
        amm2.addActionListener(this);
        amm2.setIcon(new ImageIcon(getClass().getResource("am2.png")));
        amm2.setBounds(350, 500, 100, 94);
        ventanilla.getContentPane().add(amm2);
        amm2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("ver2.png")));
        v2.setBounds(500, 500, 100, 94);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
