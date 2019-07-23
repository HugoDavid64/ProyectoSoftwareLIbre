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

/**
 *
 * @author david
 */
public class Animales extends JFrame implements ActionListener {

    JFrame vent;
    JButton sg, amarillo, rojo, azul, verde, amarillo1, rojo1, azul1, verde1, amarillo2, rojo2, azul2, verde2, amarillo3, rojo3, azul3, verde3;
    JLabel tit, perro, cfeliz, cfelizroja, gato, gallo, pato;
    AudioClip sonidoperro, sonidogato, sonidogallo, sonidopato;
    JFrame ventanaEmergente, vf;
    JButton btnAceptar, boton;
    JLabel lblimg, vff;

    public void ventAnimales() {

        vent = new JFrame("Encuentre el sonido correcto del animal ");
        vent.setSize(5000, 800);
        vent.setLocation(0, 0);
        vent.setLayout(null);
        vent.getContentPane().setBackground(Color.GRAY);
        vent.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
