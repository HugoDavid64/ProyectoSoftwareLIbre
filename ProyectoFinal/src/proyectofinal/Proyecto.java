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

   JFrame vent, vent1,ventAcercaDe;
    JLabel lbltitulo, lblfondo, c1, c2, c11, lblflf,j1,j2,j3,j4;
    JButton btnIniciar, bj1, bj2, bj3, bj4, btnIniciar2;
    Timer timer, timer2;
    JLabel homero, p1, p2, p3, p4;
    JLabel aviso;
    JLabel obstaculo;
    JLabel s1, s2, s3;
    JMenuBar barra;
    JMenu archivo,informacion,ayuda;
    JMenuItem cerrarTodo, iniciar,acercad;
    boolean ft = true;
    int tecla, x = 200, y = 100;
    int key;
    String datoPro;
    JLabel lblimg; 
    
    
   
    
    
    
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
        ventAcercaDe.setSize(700,440);
        ventAcercaDe.setLayout(null);
        ventAcercaDe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        

        
        lbltitulo.setFont(new java.awt.Font("Century Gothic", 0, 35));

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
