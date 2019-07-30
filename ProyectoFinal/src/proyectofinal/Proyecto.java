/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author david
 */
public class Proyecto extends JFrame implements ActionListener {

    JFrame vent, vent1, ventAcercaDe;
    JLabel lbltitulo, lblfondo, c1, c2, c11, lblflf, j1, j2, j3, j4;
    JButton btnIniciar, bj1, bj2, bj3, bj4, btnIniciar2;
    Timer timer, timer2;
    JLabel homero, p1, p2, p3, p4;
    JLabel aviso;
    JLabel obstaculo;
    JLabel s1, s2, s3;
    JMenuBar barra;
    JMenu archivo, informacion, ayuda;
    JMenuItem cerrarTodo, iniciar, acercad;
    boolean ft = true;
    int tecla, x = 200, y = 100;
    int key;
    String datoPro;
    JLabel lblimg;

    Animales anim = new Animales();
    Numeros num = new Numeros();
    Pn p = new Pn();
    Figura fg = new Figura ();

    public void proyecVent() throws Exception {

        vent = new JFrame();
        vent.setTitle("TEST PARA NIÑOS CON DISCAPACIDAD INTELECTUAL ");
        vent.setLocation(0, 0);
        vent.setSize(5000, 800);
        vent.getContentPane().setBackground(Color.WHITE);
        vent.setLayout(null);
        vent.setDefaultCloseOperation(EXIT_ON_CLOSE);

        vent.setVisible(true);
        lbltitulo = new JLabel(" TEST PARA NIÑOS CON DISCAPACIDAD INTELECTUAL ");
        vent.getContentPane().add(lbltitulo);
        lbltitulo.setBounds(215, 10, 1000, 100);

        btnIniciar = new JButton("  INICIAR TEST >>> ");
        vent.getContentPane().add(btnIniciar);
        btnIniciar.setBounds(575, 500, 200, 50);

        btnIniciar.addActionListener(this);
        btnIniciar.setFont(new java.awt.Font("Century Gothic", 0, 15));

        barra = new JMenuBar();
        vent.setJMenuBar(barra);

        archivo = new JMenu("Archivo");
        barra.add(archivo);

        ayuda = new JMenu("Ayuda");
        barra.add(ayuda);

        acercad = new JMenuItem("Acerca de");
        acercad.addActionListener(this);
        ayuda.add(acercad);

        iniciar = new JMenuItem(" Iniciar");
        iniciar.addActionListener(this);
        archivo.add(iniciar);

        cerrarTodo = new JMenuItem(" Cerrar Todo");
        cerrarTodo.addActionListener(this);
        archivo.add(cerrarTodo);

        ventAcercaDe = new JFrame();
        ventAcercaDe.setTitle("Acerca del Juego");
        ventAcercaDe.setLocation(350, 150);
        ventAcercaDe.setSize(700, 440);
        ventAcercaDe.setLayout(null);
        ventAcercaDe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Century Gothic", 0, 35));

        lblfondo = new JLabel();
        lblfondo.setIcon(new ImageIcon(getClass().getResource("/Recursos/fondoP.jpg")));
        vent.getContentPane().add(lblfondo);
        lblfondo.setBounds(225, 0, 880, 800);

        bj1 = new JButton(" ");
        bj1.setIcon(new ImageIcon(getClass().getResource("/Recursos/btnRojo.png")));
        bj1.addActionListener(this);
        vent.getContentPane().add(bj1);
        bj1.setBounds(1, 110, 244, 96);

        bj2 = new JButton(" ");
        bj2.setIcon(new ImageIcon(getClass().getResource("/Recursos/btnAzul.png")));
        bj2.addActionListener(this);
        vent.getContentPane().add(bj2);
        bj2.setBounds(1, 550, 244, 96);

        bj3 = new JButton(" ");
        bj3.setIcon(new ImageIcon(getClass().getResource("/Recursos/btnAmarillo.png")));
        bj3.addActionListener(this);
        vent.getContentPane().add(bj3);
        bj3.setBounds(1110, 110, 244, 96);

        bj4 = new JButton(" ");
        bj4.setIcon(new ImageIcon(getClass().getResource("/Recursos/btnVerde.png")));
        bj4.addActionListener(this);
        vent.getContentPane().add(bj4);
        bj4.setBounds(1110, 550, 244, 96);

        lblimg = new JLabel();
        lblimg.setIcon(new ImageIcon(getClass().getResource("/Recursos/AcercaDe.jpg")));
        lblimg.setBounds(0, 0, 700, 440);
        ventAcercaDe.getContentPane().add(lblimg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == acercad) {
            ventAcercaDe.setVisible(true);
        }

        if (e.getSource() == bj1) {

            anim.ventAnimales();

        }
        if (e.getSource() == bj2) {
            num.nume();

        }
        if (e.getSource() == bj3) {
            p.niños();
        }
        if (e.getSource() == bj4) {
            fg.ventana();
        }

        if (e.getSource() == btnIniciar || e.getSource() == iniciar) {
            anim.ventAnimales();
        }

        if (e.getSource() == cerrarTodo) {
            vent.setVisible(false);
        }
//practiaaa
    }

}
