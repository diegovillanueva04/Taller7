package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public Ventanaprincipal() {
        setTitle("Juego de LightsOut");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        PanelTablero panelTablero = new PanelTablero();
        PanelArriba panelArriba = new PanelArriba(panelTablero);
        PanelDerecho panelDerecha = new PanelDerecho();
        PanelAbajo panelAbajo = new PanelAbajo();
        
        add(panelArriba, BorderLayout.NORTH);
        add(panelDerecha, BorderLayout.EAST);
        add(panelAbajo, BorderLayout.SOUTH);
        add(panelTablero, BorderLayout.CENTER);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventanaprincipal();
    }
}
