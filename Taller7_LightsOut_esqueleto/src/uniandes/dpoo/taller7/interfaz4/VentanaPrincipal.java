package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Juego de LightsOut");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        PanelTablero tableroPanel = new PanelTablero(5, 5);
        PanelArriba panelArriba = new PanelArriba(tableroPanel);
        PanelDerecho panelDerecha = new PanelDerecho();
        PanelAbajo panelAbajo = new PanelAbajo();
        
        add(panelArriba, BorderLayout.NORTH);
        add(panelDerecha, BorderLayout.EAST);
        add(panelAbajo, BorderLayout.SOUTH);
        add(tableroPanel, BorderLayout.CENTER);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
