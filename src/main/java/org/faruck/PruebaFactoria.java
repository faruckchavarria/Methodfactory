package org.faruck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaFactoria extends JFrame implements ActionListener {

    private JLabel etiqueta1 = new JLabel("Introduce tipo figura:");
    private JTextField texto1 = new JTextField("0");
    private JLabel etiqueta2 = new JLabel("Introduce lado figura:");
    private JTextField texto2 = new JTextField("50");
    private JButton dibujar = new JButton("Dibujar");
    private JButton borrar = new JButton("Borrar");
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private FactoriaDeFiguras factoria = new FactoriaDeFiguras();

    public static void main(String[] args) {
        new PruebaFactoria();
    }

    public PruebaFactoria() {
        super("Prueba Factoria");
        this.setDefaultCloseOperation(3);
        this.setup();
    }

    private void setup() {
        this.getContentPane().setLayout(new BorderLayout());
        this.panel1.setLayout(new GridLayout(3, 2));
        this.panel1.add(this.etiqueta1);
        this.panel1.add(this.texto1);
        this.panel1.add(this.etiqueta2);
        this.panel1.add(this.texto2);
        this.panel1.add(this.dibujar);
        this.panel1.add(this.borrar);
        this.dibujar.addActionListener(this);
        this.borrar.addActionListener(this);
        this.getContentPane().add("North", this.panel1);
        this.getContentPane().add("Center", this.panel2);
        this.setSize(450, 400);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.dibujar) {
            Graphics g = this.panel2.getGraphics();
            int t = Integer.parseInt(this.texto1.getText());
            int l = Integer.parseInt(this.texto2.getText());
            Figuras figura = this.factoria.getFigura(t, l);
            figura.dibujar(g, 175, 20);
        }

        if (e.getSource() == this.borrar) {
            this.repaint();
        }

    }
}
