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
 * @author david
 */
public class Animales extends JFrame implements ActionListener {

    JFrame vent;
    JButton sg, amarillo, rojo, azul, verde, amarillo1, rojo1, azul1, verde1, amarillo2, rojo2, azul2, verde2, amarillo3, rojo3, azul3, verde3;
    JLabel tit, perro, cfeliz, cfelizroja, gato, gallo, pato;
    AudioClip sonidoperro, sonidogato, sonidogallo, sonidopato;
    //Ventana emergente
    JFrame ventanaEmergente,vf;
    JButton btnAceptar,boton;
    JLabel lblimg,vff;

    public void ventAnimales() {

        sonidoperro = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/PERRO.wav"));
        sonidogato = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/GATO.wav"));
        sonidogallo = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/GALLO.wav"));
        sonidopato = java.applet.Applet.newAudioClip(getClass().getResource("/Recursos/PATO.wav"));

        vent = new JFrame("Encuentre el sonido correcto del animal ");
        vent.setSize(5000, 800);
        vent.setLocation(0, 0);
        vent.setLayout(null);
        vent.getContentPane().setBackground(Color.GRAY);
        vent.setVisible(true);

        perro = new JLabel();
        perro.setIcon(new ImageIcon(getClass().getResource("/Recursos/perro.gif")));
        perro.setBounds(100, 200, 150, 187);
        vent.getContentPane().add(perro);

        sg = new JButton("  Reiniciar >>> ");
        sg.setBounds(1000, 600, 200, 50);
        sg.addActionListener(this);
        sg.setVisible(true);
        sg.setFont(new java.awt.Font("Century Gothic", 0, 15));
        vent.getContentPane().add(sg);

        tit = new JLabel(" ENCUENTRE EL SONIDO CORRECTO DEL ANIMAL ");
        tit.setBounds(250, 60, 1000, 100);
        tit.setVisible(true);
        tit.setFont(new java.awt.Font("Century Gothic", 0, 35));
        vent.getContentPane().add(tit);
        //perro
        amarillo = new JButton();
        amarillo.setIcon(new ImageIcon(getClass().getResource("/Recursos/amarillo.png")));
        amarillo.setBounds(850, 450, 120, 70);
        vent.getContentPane().add(amarillo);
        amarillo.setVisible(true);
        amarillo.addActionListener(this);

        verde = new JButton();
        verde.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        verde.setBounds(1050, 450, 120, 70);
        vent.getContentPane().add(verde);
        verde.setVisible(true);
        verde.addActionListener(this);

        azul = new JButton();
        azul.setIcon(new ImageIcon(getClass().getResource("/Recursos/azul.png")));
        azul.setBounds(350, 450, 120, 70);
        vent.getContentPane().add(azul);
        azul.setVisible(true);
        azul.addActionListener(this);

        rojo = new JButton();
        rojo.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        rojo.setBounds(150, 450, 120, 70);
        vent.getContentPane().add(rojo);
        rojo.setVisible(true);
        rojo.addActionListener(this);

        //caritas
        cfeliz = new JLabel();
        cfeliz.setBounds(1200, 200, 150, 150);
        cfeliz.setIcon(new ImageIcon(getClass().getResource("/Recursos/Bien.png")));
        vent.getContentPane().add(cfeliz);
        cfeliz.setVisible(false);

        cfelizroja = new JLabel();
        cfelizroja.setBounds(1200, 350, 150, 150);
        cfelizroja.setIcon(new ImageIcon(getClass().getResource("/Recursos/Mal.png")));
        vent.getContentPane().add(cfelizroja);
        cfelizroja.setVisible(false);
        //gato
        gato = new JLabel();
        gato.setIcon(new ImageIcon(getClass().getResource("/Recursos/gato.jpg")));
        gato.setBounds(100, 200, 150, 187);
        gato.setVisible(false);
        vent.getContentPane().add(gato);

        amarillo1 = new JButton();
        amarillo1.setIcon(new ImageIcon(getClass().getResource("/Recursos/amarillo.png")));
        amarillo1.setBounds(850, 450, 120, 70);
        vent.getContentPane().add(amarillo1);
        amarillo1.setVisible(false);
        amarillo1.addActionListener(this);

        verde1 = new JButton();
        verde1.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        verde1.setBounds(1050, 450, 120, 70);
        vent.getContentPane().add(verde1);
        verde1.setVisible(false);
        verde1.addActionListener(this);

        azul1 = new JButton();
        azul1.setIcon(new ImageIcon(getClass().getResource("/Recursos/azul.png")));
        azul1.setBounds(350, 450, 120, 70);
        vent.getContentPane().add(azul1);
        azul1.setVisible(false);
        azul1.addActionListener(this);

        rojo1 = new JButton();
        rojo1.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        rojo1.setBounds(150, 450, 120, 70);
        vent.getContentPane().add(rojo1);
        rojo1.setVisible(false);
        rojo1.addActionListener(this);
        //gallo

        gallo = new JLabel();
        gallo.setIcon(new ImageIcon(getClass().getResource("/Recursos/gallos.gif")));
        gallo.setBounds(100, 200, 150, 187);
        gallo.setVisible(false);
        vent.getContentPane().add(gallo);

        amarillo2 = new JButton();
        amarillo2.setIcon(new ImageIcon(getClass().getResource("/Recursos/amarillo.png")));
        amarillo2.setBounds(850, 450, 120, 70);
        vent.getContentPane().add(amarillo2);
        amarillo2.setVisible(false);
        amarillo2.addActionListener(this);

        verde2 = new JButton();
        verde2.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        verde2.setBounds(1050, 450, 120, 70);
        vent.getContentPane().add(verde2);
        verde2.setVisible(false);
        verde2.addActionListener(this);

        azul2 = new JButton();
        azul2.setIcon(new ImageIcon(getClass().getResource("/Recursos/azul.png")));
        azul2.setBounds(350, 450, 120, 70);
        vent.getContentPane().add(azul2);
        azul2.setVisible(false);
        azul2.addActionListener(this);

        rojo2 = new JButton();
        rojo2.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        rojo2.setBounds(150, 450, 120, 70);
        vent.getContentPane().add(rojo2);
        rojo2.setVisible(false);
        rojo2.addActionListener(this);

        //pato
        pato = new JLabel();
        pato.setIcon(new ImageIcon(getClass().getResource("/Recursos/donald.gif")));
        pato.setBounds(100, 200, 150, 187);
        pato.setVisible(false);
        vent.getContentPane().add(pato);

        amarillo3 = new JButton();
        amarillo3.setIcon(new ImageIcon(getClass().getResource("/Recursos/amarillo.png")));
        amarillo3.setBounds(850, 450, 120, 70);
        vent.getContentPane().add(amarillo3);
        amarillo3.setVisible(false);
        amarillo3.addActionListener(this);

        verde3 = new JButton();
        verde3.setIcon(new ImageIcon(getClass().getResource("/Recursos/verde.png")));
        verde3.setBounds(1050, 450, 120, 70);
        vent.getContentPane().add(verde3);
        verde3.setVisible(false);
        verde3.addActionListener(this);

        azul3 = new JButton();
        azul3.setIcon(new ImageIcon(getClass().getResource("/Recursos/azul.png")));
        azul3.setBounds(350, 450, 120, 70);
        vent.getContentPane().add(azul3);
        azul3.setVisible(false);
        azul3.addActionListener(this);

        rojo3 = new JButton();
        rojo3.setIcon(new ImageIcon(getClass().getResource("/Recursos/rojo.png")));
        rojo3.setBounds(150, 450, 120, 70);
        vent.getContentPane().add(rojo3);
        rojo3.setVisible(false);
        rojo3.addActionListener(this);

        //Ventana de Instrucciones
        ventanaEmergente = new JFrame();
        ventanaEmergente.setTitle("Instrucción");
        ventanaEmergente.setLocation(450, 150);
        ventanaEmergente.setSize(501, 500);
        ventanaEmergente.setLayout(null);
        ventanaEmergente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        lblimg = new JLabel();
        lblimg.setIcon(new ImageIcon(getClass().getResource("/Recursos/sonidoAnimal.jpg")));
        lblimg.setBounds(0, 0, 501, 500);
        ventanaEmergente.getContentPane().add(lblimg);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(180, 350, 110, 50);
        btnAceptar.addActionListener(this);
        ventanaEmergente.getContentPane().add(btnAceptar);

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
        vff.setIcon(new ImageIcon(getClass().getResource("/Recursos/LoLograste.png")));
        vff.setBounds(0, 0, 501, 500);
        vf.getContentPane().add(vff);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAceptar) {
            ventanaEmergente.setVisible(false);
        }

        if (ae.getSource() == boton) {
            vf.setVisible(false);
            Numeros obj1 = new Numeros();
            obj1.nume();
            vent.dispose();
        }
        //perro
        if (ae.getSource() == rojo) {
            cfelizroja.setVisible(true);
            sonidogallo.play();
        }
        if (ae.getSource() == azul) {
            sonidogato.play();
            cfelizroja.setVisible(true);
        }
        if (ae.getSource() == amarillo) {
            sonidopato.play();
            cfelizroja.setVisible(true);
        }
        if (ae.getSource() == verde) {
            sonidoperro.play();

            cfelizroja.setVisible(false);

            cfeliz.setVisible(true);
            amarillo.setVisible(false);
            verde.setVisible(false);
            azul.setVisible(false);
            rojo.setVisible(false);

            amarillo1.setVisible(true);
            verde1.setVisible(true);
            azul1.setVisible(true);
            rojo1.setVisible(true);
            gato.setVisible(true);
            perro.setVisible(false);

        }
        //gato
        if (ae.getSource() == verde1) {
            gato.setVisible(true);
            perro.setVisible(false);
            sonidopato.play();
            cfeliz.setVisible(false);
            cfelizroja.setVisible(true);

        }
        if (ae.getSource() == rojo1) {
            perro.setVisible(false);
            gato.setVisible(true);
            sonidopato.play();
            cfeliz.setVisible(false);
            cfelizroja.setVisible(true);

        }
        if (ae.getSource() == azul1) {
            perro.setVisible(false);
            gato.setVisible(true);
            sonidoperro.play();
            cfeliz.setVisible(false);
            cfelizroja.setVisible(true);

        }
        if (ae.getSource() == amarillo1) {
            perro.setVisible(false);
            gato.setVisible(true);
            sonidogato.play();

            cfelizroja.setVisible(false);
            cfeliz.setVisible(true);

            verde1.setVisible(false);
            rojo1.setVisible(false);
            azul1.setVisible(false);
            amarillo1.setVisible(false);

            verde2.setVisible(true);
            rojo2.setVisible(true);
            azul2.setVisible(true);
            amarillo2.setVisible(true);
            gallo.setVisible(true);
            gato.setVisible(false);
        }
        //gallo

        if (ae.getSource() == verde2) {
            gallo.setVisible(true);
            gato.setVisible(false);
            cfeliz.setVisible(false);
            sonidogato.play();
            cfeliz.setVisible(false);
            cfelizroja.setVisible(true);

        }
        if (ae.getSource() == rojo2) {
            gallo.setVisible(true);
            gato.setVisible(false);
            sonidoperro.play();
            cfeliz.setVisible(false);
            cfelizroja.setVisible(true);

        }
        if (ae.getSource() == amarillo2) {
            gallo.setVisible(true);
            gato.setVisible(false);
            sonidopato.play();
            cfeliz.setVisible(false);
            cfelizroja.setVisible(true);

        }
        if (ae.getSource() == azul2) {
            gallo.setVisible(true);
            gato.setVisible(false);
            sonidogallo.play();
            cfeliz.setVisible(true);
            cfelizroja.setVisible(false);
            verde2.setVisible(false);
            rojo2.setVisible(false);
            amarillo2.setVisible(false);
            azul2.setVisible(false);
            verde3.setVisible(true);
            rojo3.setVisible(true);
            amarillo3.setVisible(true);
            azul3.setVisible(true);
            gallo.setVisible(false);
            pato.setVisible(true);

        }
        //pato
        if (ae.getSource() == amarillo3) {
            gallo.setVisible(false);
            pato.setVisible(true);
            sonidoperro.play();
            cfeliz.setVisible(false);
            cfelizroja.setVisible(true);
            
        }
        if (ae.getSource() == azul3) {
             gallo.setVisible(false);
            pato.setVisible(true);
            sonidoperro.play();
            cfelizroja.setVisible(true);
            
        }
        if (ae.getSource() == verde3) {
             gallo.setVisible(false);
            pato.setVisible(true);
            sonidogato.play();
            cfelizroja.setVisible(true);
            
        }
        if (ae.getSource() == rojo3) {
             gallo.setVisible(false);
            pato.setVisible(true);
            sonidopato.play();
            
            cfelizroja.setVisible(false);
            cfeliz.setVisible(true);
            vf.setVisible(true);
        }
        
        if (ae.getSource() == sg) {
            try {
                vent.dispose();
            } catch (Exception ex) {
                Logger.getLogger(Animales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void salir() {
        vent.dispose();
    }

    public void aceptar() {
        ventanaEmergente.setVisible(false);
    }

}
