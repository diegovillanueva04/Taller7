package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Juego de LightsOut");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        PanelArriba panelArriba = new PanelArriba();
        PanelDerecha panelDerecha = new PanelDerecha();
        PanelAbajo panelAbajo = new PanelAbajo();
        
        add(panelArriba, BorderLayout.NORTH);
        add(panelDerecha, BorderLayout.EAST);
        add(panelAbajo, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
