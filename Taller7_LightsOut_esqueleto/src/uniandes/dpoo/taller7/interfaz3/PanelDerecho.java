package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {
    public PanelDerecho() {
        setLayout(new GridLayout(4, 1, 10, 10));
        
        JButton nuevoButton = new JButton("NUEVO");
        nuevoButton.setFont(new Font("Arial", Font.BOLD, 14));
        nuevoButton.setBackground(Color.CYAN);
        
        JButton reiniciarButton = new JButton("REINICIAR");
        reiniciarButton.setFont(new Font("Arial", Font.BOLD, 14));
        reiniciarButton.setBackground(Color.ORANGE);
        
        JButton top10Button = new JButton("TOP-10");
        top10Button.setFont(new Font("Arial", Font.BOLD, 14));
        top10Button.setBackground(Color.GREEN);
        
        JButton cambiarJugadorButton = new JButton("CAMBIAR JUGADOR");
        cambiarJugadorButton.setFont(new Font("Arial", Font.BOLD, 14));
        cambiarJugadorButton.setBackground(Color.MAGENTA);
        
        add(nuevoButton);
        add(reiniciarButton);
        add(top10Button);
        add(cambiarJugadorButton);

        setBackground(Color.DARK_GRAY);
    }
}
