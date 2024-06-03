package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelArriba extends JPanel {
    private JComboBox<String> tamañoComboBox;

    public PanelArriba(PanelTablero panelTablero) {
        setLayout(new FlowLayout());
        
        JLabel tamañoLabel = new JLabel("Tamaño:");
        tamañoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        String[] tamaños = { "5x5", "6x6", "7x7" };
        tamañoComboBox = new JComboBox<>(tamaños);
        tamañoComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        tamañoComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) tamañoComboBox.getSelectedItem();
                int size = Integer.parseInt(selected.split("x")[0]);
                panelTablero.setSize(size);
            }
        });
        
        JLabel dificultadLabel = new JLabel("Dificultad:");
        dificultadLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        JRadioButton facilRadioButton = new JRadioButton("Fácil");
        facilRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        JRadioButton medioRadioButton = new JRadioButton("Medio");
        medioRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        JRadioButton dificilRadioButton = new JRadioButton("Difícil");
        dificilRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        
        ButtonGroup dificultadGroup = new ButtonGroup();
        dificultadGroup.add(facilRadioButton);
        dificultadGroup.add(medioRadioButton);
        dificultadGroup.add(dificilRadioButton);
        
        add(tamañoLabel);
        add(tamañoComboBox);
        add(dificultadLabel);
        add(facilRadioButton);
        add(medioRadioButton);
        add(dificilRadioButton);

        setBackground(Color.LIGHT_GRAY);
    }
}
