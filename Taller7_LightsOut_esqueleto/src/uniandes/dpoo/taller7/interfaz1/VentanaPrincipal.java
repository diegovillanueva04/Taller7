package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Juego de LightsOut");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
