package uniandes.dpoo.taller7.interfaz3;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAbajo extends JPanel {
    private JLabel jugadasLabel;
    private JTextField jugadasField;
    private JLabel jugadorLabel;
    private JTextField jugadorField;

    public PanelAbajo() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        
        jugadasLabel = new JLabel("Jugadas:");
        jugadasField = new JTextField("0", 5);
        
        jugadorLabel = new JLabel("Jugador:");
        jugadorField = new JTextField("", 10);
        
        add(jugadasLabel);
        add(jugadasField);
        add(jugadorLabel);
        add(jugadorField);
    }
}
