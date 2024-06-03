package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class PanelArriba extends JPanel {
    public PanelArriba() {
        setLayout(new FlowLayout());
        
        JLabel tama�oLabel = new JLabel("Tama�o:");
        tama�oLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        String[] tama�os = { "5x5", "6x6", "7x7" };
        JComboBox<String> tama�oComboBox = new JComboBox<>(tama�os);
        tama�oComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JLabel dificultadLabel = new JLabel("Dificultad:");
        dificultadLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        JRadioButton facilRadioButton = new JRadioButton("F�cil");
        facilRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        JRadioButton medioRadioButton = new JRadioButton("Medio");
        medioRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        JRadioButton dificilRadioButton = new JRadioButton("Dif�cil");
        dificilRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        
        ButtonGroup dificultadGroup = new ButtonGroup();
        dificultadGroup.add(facilRadioButton);
        dificultadGroup.add(medioRadioButton);
        dificultadGroup.add(dificilRadioButton);
        
        add(tama�oLabel);
        add(tama�oComboBox);
        add(dificultadLabel);
        add(facilRadioButton);
        add(medioRadioButton);
        add(dificilRadioButton);

        setBackground(Color.LIGHT_GRAY);
    }
}
