package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelArriba extends JPanel {
    private JComboBox<String> tama�oComboBox;

    public PanelArriba(PanelTablero tableroPanel) {
        setLayout(new FlowLayout());
        
        JLabel tama�oLabel = new JLabel("Tama�o:");
        tama�oLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        String[] tama�os = { "5x5", "6x6", "7x7" };
        tama�oComboBox = new JComboBox<>(tama�os);
        tama�oComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        tama�oComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccionado = (String) tama�oComboBox.getSelectedItem();
                int tama�o = Integer.parseInt(seleccionado.split("x")[0]);
                tableroPanel.setDimensiones(tama�o, tama�o);
            }
        });
        
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

