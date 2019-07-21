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
          iupi = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/son.wav"));
        iupi2 = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/son1.wav"));

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
        r.setIcon(new ImageIcon(getClass().getResource("/Recursos/ro.png")));
        r.setBounds(50, 500, 100, 94);
        ventanilla.getContentPane().add(r);

        a = new JButton("");
        a.addActionListener(this);
        a.setBounds(200, 500, 100, 94);
        a.setIcon(new ImageIcon(getClass().getResource("/Recursos/az.png")));//ffffffffffffffffffffffalta imagen 
        ventanilla.getContentPane().add(a);

        amm = new JButton("");
        amm.addActionListener(this);
        amm.setIcon(new ImageIcon(getClass().getResource("/Recursos/am.png")));
        amm.setBounds(350, 500, 100, 94);
        ventanilla.getContentPane().add(amm);
        
         v = new JButton("");
        v.addActionListener(this);
        v.setIcon(new ImageIcon(getClass().getResource("/Recursos/ver2.png")));
        v.setBounds(500, 500, 100, 94);
        ventanilla.getContentPane().add(v);

        // BOTONES 2
        r2 = new JButton();
        r2.addActionListener(this);
        r2.setIcon(new ImageIcon(getClass().getResource("/Recursos/ro.png")));
        r2.setBounds(50, 500, 100, 94);
        ventanilla.getContentPane().add(r2);
        r2.setVisible(false);

        a2 = new JButton("");
        a2.addActionListener(this);
        a2.setBounds(200, 500, 100, 94);
        a2.setIcon(new ImageIcon(getClass().getResource("/Recursos/az.png")));
        ventanilla.getContentPane().add(a2);
        a2.setVisible(false);

        amm2 = new JButton("");
        amm2.addActionListener(this);
        amm2.setIcon(new ImageIcon(getClass().getResource("/Recursos/am2.png")));
        amm2.setBounds(350, 500, 100, 94);
        ventanilla.getContentPane().add(amm2);
        amm2.setVisible(false);

        v2 = new JButton("");
        v2.addActionListener(this);
        v2.setIcon(new ImageIcon(getClass().getResource("/Recursos/ver2.png")));
        v2.setBounds(500, 500, 100, 94);
        ventanilla.getContentPane().add(v2);
        v2.setVisible(false);
        
        //BOTONES 3

        r3 = new JButton();
        r3.addActionListener(this);
        r3.setIcon(new ImageIcon(getClass().getResource("/Recursos/ro.png")));
        r3.setBounds(50, 500, 100, 94);
        ventanilla.getContentPane().add(r3);

        a3 = new JButton("");
        a3.addActionListener(this);
        a3.setBounds(200, 500, 100, 94);
        a3.setIcon(new ImageIcon(getClass().getResource("/Recursos/az.png")));
        ventanilla.getContentPane().add(a3);

        amm3 = new JButton("");
        amm3.addActionListener(this);
        amm3.setIcon(new ImageIcon(getClass().getResource("/Recursos/am.png")));
        amm3.setBounds(350, 500, 100, 94);
        ventanilla.getContentPane().add(amm3);

        v3 = new JButton("");
        v3.addActionListener(this);
        v3.setIcon(new ImageIcon(getClass().getResource("/Recursos/ver2.png")));
        v3.setBounds(500, 500, 100, 94);
        ventanilla.getContentPane().add(v3);

        // BOTONES 4
        r4 = new JButton();
        r4.addActionListener(this);
        r4.setIcon(new ImageIcon(getClass().getResource("/Recursos/ro.png")));
        r4.setBounds(50, 500, 100, 94);
        ventanilla.getContentPane().add(r4);

        r5 = new JButton();
        r5.addActionListener(this);
        r5.setIcon(new ImageIcon(getClass().getResource("/Recursos/ro.png")));
        r5.setBounds(50, 500, 100, 94);
        ventanilla.getContentPane().add(r5);

        a4 = new JButton("");
        a4.addActionListener(this);
        a4.setBounds(200, 500, 100, 94);
        a4.setIcon(new ImageIcon(getClass().getResource("/Recursos/az.png")));
        ventanilla.getContentPane().add(a4);

        amm4 = new JButton("");
        amm4.addActionListener(this);
        amm4.setIcon(new ImageIcon(getClass().getResource("/Recursos/am.png")));
        amm4.setBounds(350, 500, 100, 94);
        ventanilla.getContentPane().add(amm4);

        ver4 = new JButton("");
        ver4.addActionListener(this);
        ver4.setIcon(new ImageIcon(getClass().getResource("/Recursos/ver2.png")));
        ver4.setBounds(500, 500, 100, 94);
        ventanilla.getContentPane().add(ver4);
        
        
        //FIN BOTONES PERROS
        p1 = new JLabel();
        p1.setIcon(new ImageIcon(getClass().getResource("/Recursos/p.png")));
        p1.setBounds(350, 10, 700, 500);
        ventanilla.getContentPane().add(p1);

       
        // GATOS
        g1 = new JLabel();
        g1.setIcon(new ImageIcon(getClass().getResource("/Recursos/g.png")));
        g1.setBounds(500, 10, 500, 500);
        ventanilla.getContentPane().add(g1);
        g1.setVisible(false);

      
        //PELOTAS
        b = new JLabel();
        b.setIcon(new ImageIcon(getClass().getResource("/Recursos/pl.png")));
        b.setBounds(300, 10, 700, 500);
        ventanilla.getContentPane().add(b);
        b.setVisible(false);


        //soles
        soles = new JLabel();
        soles.setIcon(new ImageIcon(getClass().getResource("/Recursos/s.png")));
        soles.setBounds(100, 50, 400, 400);
        ventanilla.getContentPane().add(soles);
        soles.setVisible(false);

        soles2 = new JLabel();
        soles2.setIcon(new ImageIcon(getClass().getResource("/Recursos/s2.png")));
        soles2.setBounds(700, 200, 400, 400);
        ventanilla.getContentPane().add(soles2);
        soles2.setVisible(false);

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
        
        vf = new JFrame();
        vf.setTitle("");
        vf.setLocation(450, 150);
        vf.setSize(501, 500);
        vf.setLayout(null);
        vf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
          
        boton = new JButton("Aceptar");
        boton.setBounds(180, 350, 110,50);
        boton.addActionListener(this);
        vf.getContentPane().add(boton);
        
        
        vff= new JLabel();
        vff.setIcon(new ImageIcon(getClass().getResource("/Recursos/HG.png")));
        vff.setBounds(0, 0, 501, 500);
        vf.getContentPane().add(vff);
        
        
        
        lblimg= new JLabel();
        lblimg.setIcon(new ImageIcon(getClass().getResource("/Recursos/contarObjetos.jpg")));
        lblimg.setBounds(0, 0, 501, 500);
        ventanaEmergente.getContentPane().add(lblimg);
  
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(180, 350, 110,50);
        btnAceptar.addActionListener(this);
        ventanaEmergente.getContentPane().add(btnAceptar);
        
       
        ventanilla.setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==btnAceptar)
        {   ventanaEmergente.setVisible(false);     } 
        
        if(ae.getSource()==boton)
        {   vf.setVisible(false);
            Pn obj2 = new Pn();
            obj2.niños();
            ventanilla.dispose();
        }
        
        if (ae.getSource() == r) {
             iupi2.play();
            cv.setVisible(false);
            cr.setVisible(true);
            //Proyecto.enviar("0");
            lblflf.setVisible(false);
        }
        
        if (ae.getSource() == a) {
             iupi2.play();
            cv.setVisible(false);
            cr.setVisible(true);
            //Proyecto.enviar("0");
        }
        
        if (ae.getSource() == v) {
             iupi2.play();
            cv.setVisible(false);
            cr.setVisible(true);
            //Proyecto.enviar("0");
        } else if (ae.getSource() == amm) {
            cv.setVisible(true);
            //Proyecto.enviar("1");
            cr.setVisible(false);
            iupi.play();
            p1.setVisible(false);
            
            g1.setVisible(true);
            
            r.setVisible(false);
            a.setVisible(false);
            v.setVisible(false);
            amm.setVisible(false);
            r2.setVisible(true);
            a2.setVisible(true);
            v2.setVisible(true);
            amm2.setVisible(true);

        }
        
        //GATOS
        if (ae.getSource() == r2) {
        iupi2.play();
            cv.setVisible(false);
            cr.setVisible(true);
            //Proyecto.enviar("0");
        }
        
        if (ae.getSource() == amm2) {
            cv.setVisible(false);
             iupi2.play();
            cr.setVisible(true);
            //Proyecto.enviar("0");
        }
        
        if (ae.getSource() == v2) {
            cv.setVisible(false);
             iupi2.play();
            cr.setVisible(true);
            //Proyecto.enviar("0");
        } else if (ae.getSource() == a2) {
            cv.setVisible(true);
            //Proyecto.enviar("1");
            cr.setVisible(false);
            iupi.play();
            g1.setVisible(false);
   
            r.setVisible(false);
            a.setVisible(false);
            v.setVisible(false);
            amm.setVisible(false);
            r3.setVisible(true);

            a3.setVisible(true);
            v3.setVisible(true);
            amm3.setVisible(true);
            r2.setVisible(false);
            a2.setVisible(false);
            v2.setVisible(false);
            amm2.setVisible(false);
            soles.setVisible(true);
            soles2.setVisible(true);

        }

        //SOLES
        if (ae.getSource() == amm3) {
            cv.setVisible(false);
             iupi2.play();
            cr.setVisible(true);
            //Proyecto.enviar("0");
        }
        
        if (ae.getSource() == a3) {
            cv.setVisible(false);
             iupi2.play();
            cr.setVisible(true);
            //Proyecto.enviar("0");
        }
        
        if (ae.getSource() == v3) {
            cv.setVisible(false);
             iupi2.play();
            cr.setVisible(true);
            //Proyecto.enviar("0");
        } else if (ae.getSource() == r3) {
            cv.setVisible(true);
            //Proyecto.enviar("1");
            cr.setVisible(false);
            iupi.play();
            r.setVisible(false);
            a.setVisible(false);
            v.setVisible(false);
            amm.setVisible(false);
            r3.setVisible(false);
            a3.setVisible(false);
            v3.setVisible(false);
            amm3.setVisible(false);
            r4.setVisible(true);
            a4.setVisible(true);
            ver4.setVisible(true);
            amm4.setVisible(true);
            r2.setVisible(false);
            a2.setVisible(false);
            v2.setVisible(false);
            amm2.setVisible(false);
            b.setVisible(true);
            
            soles.setVisible(false);
            soles2.setVisible(false);

        }

        //balones
        if (ae.getSource() == amm4) {
            cv.setVisible(false);
             iupi2.play();
            cr.setVisible(true);
            //Proyecto.enviar("0");          
        }

        if (ae.getSource() == a4) {
            cv.setVisible(false);
            cr.setVisible(true);
            //Proyecto.enviar("0");
            iupi2.play();
        }
        
        if (ae.getSource() == r4) {
            cv.setVisible(false);
            iupi2.play();
            cr.setVisible(true);
            //Proyecto.enviar("0");
        } else if (ae.getSource() == ver4) {
            cv.setVisible(true);
            //Proyecto.enviar("1");
            iupi.play();
            cr.setVisible(false);
            vf.setVisible(true);
        }
        
        if (ae.getSource() == pause) {
           
            ventanilla.dispose();         
        }
    }
    
    public void salir(){
            ventanilla.dispose();
    }
}
