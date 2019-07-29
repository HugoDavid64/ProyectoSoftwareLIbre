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
public class Pn extends JFrame implements ActionListener {

    Timer tiempo;
    JMenu menAr, menBot;
    JMenuItem itSalir, itPlay, itParar;
    JMenuBar barra;
    JFrame ventanilla, ventana2, ventana3, v4, v5;
    JLabel cv, cr, p, j, f, d, lblflf;
    JButton r, a, v, amm, r2, a2, v2, amm2, r3, r5, a3, v3, amm3, r4, a4, ver4, amm4, pause;
    AudioClip sonido, sonido2;
    int velocidad, cont = 1, delayCont;

    JFrame ventanaEmergente, vf;
    JButton btnAceptar, boton;
    JLabel lblimg, vff;

    public void niños() {

        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/son.wav"));
        sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/son1.wav"));
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
        r.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        r.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r);

        v = new JButton("");
        v.addActionListener(this);
        v.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        v.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v);

        // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        r2.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        v2.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        r3.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r3);
        r3.setVisible(false);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        v3.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(v3);
        v3.setVisible(false);

        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        r4.setBounds(50, 500, 120, 70);
        ventanilla.getContentPane().add(r4);
        r4.setVisible(false);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        ver4.setBounds(500, 500, 120, 70);
        ventanilla.getContentPane().add(ver4);
        ver4.setVisible(false);

        //niños
        p = new JLabel();
        p.setIcon(new ImageIcon(getClass().getResource("/Recursos/pe.png")));
        p.setBounds(400, 10, 500, 500);
        ventanilla.getContentPane().add(p);
        p.setVisible(true);

        j = new JLabel();
        j.setIcon(new ImageIcon(getClass().getResource("/Recursos/j.png")));
        j.setBounds(500, 10, 500, 500);
        ventanilla.getContentPane().add(j);
        j.setVisible(false);

        f = new JLabel();
        f.setIcon(new ImageIcon(getClass().getResource("/Recursos/f.jpg")));
        f.setBounds(500, 10, 500, 500);
        ventanilla.getContentPane().add(f);
        f.setVisible(false);

        d = new JLabel();
        d.setIcon(new ImageIcon(getClass().getResource("/Recursos/d.png")));
        d.setBounds(500, 10, 500, 500);
        ventanilla.getContentPane().add(d);
        d.setVisible(false);

        cv = new JLabel();
        cv.setBounds(1200, 200, 150, 150);
        cv.setIcon(new ImageIcon(getClass().getResource("/Recursos/fv.png")));
        ventanilla.getContentPane().add(cv);
        cv.setVisible(false);

        cr = new JLabel();
        cr.setBounds(1200, 350, 150, 150);
        cr.setIcon(new ImageIcon(getClass().getResource("/Recursos/fy.png")));
        ventanilla.getContentPane().add(cr);
        cr.setVisible(false);

        ventanaEmergente = new JFrame();
        ventanaEmergente.setTitle("Instrucción");
        ventanaEmergente.setLocation(450, 150);
        ventanaEmergente.setSize(501, 500);
        ventanaEmergente.setLayout(null);
        ventanaEmergente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        lblimg = new JLabel();
        lblimg.setIcon(new ImageIcon(getClass().getResource("/Recursos/correctoIncorrecto.jpg")));
        lblimg.setBounds(0, 0, 501, 500);
        ventanaEmergente.getContentPane().add(lblimg);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(180, 350, 110, 50);
        btnAceptar.addActionListener(this);
        ventanaEmergente.getContentPane().add(btnAceptar);;

        vf = new JFrame();
        vf.setTitle("");
        vf.setLocation(450, 150);
        vf.setSize(501, 500);
        vf.setLayout(null);
        vf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        boton = new JButton("Aceptar");
        boton.setBounds(180, 350, 110, 50);
        boton.addActionListener(this);
        vf.getContentPane().add(boton);

        vff = new JLabel();
        vff.setIcon(new ImageIcon(getClass().getResource("/Recursos/HG.png")));
        vff.setBounds(0, 0, 501, 500);
        vf.getContentPane().add(vff);

        ventanilla.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==btnAceptar)
        {   ventanaEmergente.setVisible(false);
            
        }
        if(ae.getSource()==boton)
        {   vf.setVisible(false);  
            //Figuras fg = new Figuras ();
           // fg.Vent();
            ventanilla.dispose();
        }

        if (ae.getSource() == v) {
            lblflf.setVisible(false);
            cv.setVisible(false);
            sonido2.play();
          

        } else if (ae.getSource() == r) {
            lblflf.setVisible(false);
            cv.setVisible(true);
            
            sonido.play();
            cr.setVisible(false);
           
            p.setVisible(false);
            j.setVisible(true);
            r.setVisible(false);
            v.setVisible(false);
            r2.setVisible(true);
            v2.setVisible(true);

        }
                    //Jugando

        if (ae.getSource() == r2) {
            cv.setVisible(false);
            sonido2.play();
            cr.setVisible(true);
            
        } else if (ae.getSource() == v2) {
            cv.setVisible(true);
          
            sonido.play();
            cr.setVisible(false);
            j.setVisible(false);
            f.setVisible(true);
            r.setVisible(false);
            v.setVisible(false);
            r2.setVisible(false);
            v2.setVisible(false);
            r4.setVisible(true);
            v3.setVisible(true);

        }

                    //Familia
        if (ae.getSource() == r4) {
            cv.setVisible(false);
            sonido2.play();
            cr.setVisible(true);
         
        } else if (ae.getSource() == v3) {
            cv.setVisible(true);
           
            sonido.play();
            j.setVisible(false);
            cr.setVisible(false);
            f.setVisible(false);
            d.setVisible(true);
            r.setVisible(false);
            v.setVisible(true);
            r3.setVisible(true);
            v3.setVisible(false);

            ver4.setVisible(true);

        }

             //discutiendo
        if (ae.getSource() == ver4) {
            cv.setVisible(false);
            sonido2.play();
            cr.setVisible(true);
          
        } else if (ae.getSource() == r3) {
            cv.setVisible(true);
           
            sonido.play();
            cr.setVisible(false);
            vf.setVisible(true);

        }
        if(ae.getSource()==pause){
       
        ventanilla.dispose();
            
        }
        
    }
    public void salir(){
    
        ventanilla.dispose();
    
    
    }

}
