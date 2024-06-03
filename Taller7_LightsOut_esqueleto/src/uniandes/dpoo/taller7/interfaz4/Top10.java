package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Top10 extends JDialog {
    public Top10(JFrame parent, ArrayList<Jugador> top10) {
        super(parent, "Top 10 Puntajes", true);
        setSize(300, 400);
        setLayout(new BorderLayout());

        JList<Jugador> lista = new JList<>(top10.toArray(new Jugador[0]));
        lista.setCellRenderer(new JugadorCellRenderer());
        add(new JScrollPane(lista), BorderLayout.CENTER);

        JButton cerrarButton = new JButton("Cerrar");
        cerrarButton.addActionListener(e -> dispose());
        add(cerrarButton, BorderLayout.SOUTH);
    }

    private class JugadorCellRenderer extends JPanel implements ListCellRenderer<Jugador> {
        private JLabel nombreLabel;
        private JLabel puntajeLabel;
        private JLabel posicionLabel;

        public JugadorCellRenderer() {
            setLayout(new GridLayout(1, 3));
            nombreLabel = new JLabel();
            puntajeLabel = new JLabel();
            posicionLabel = new JLabel();

            nombreLabel.setFont(new Font("Arial", Font.BOLD, 14));
            puntajeLabel.setFont(new Font("Arial", Font.BOLD, 14));
            posicionLabel.setFont(new Font("Arial", Font.BOLD, 14));

            add(posicionLabel);
            add(nombreLabel);
            add(puntajeLabel);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Jugador> list, Jugador jugador, int index, boolean isSelected, boolean cellHasFocus) {
            nombreLabel.setText(jugador.getNombre());
            puntajeLabel.setText(String.valueOf(jugador.getPuntaje()));
            posicionLabel.setText(String.valueOf(index + 1));

            if (index == 0) {
                setBackground(Color.BLACK);
            } else if (index == 1) {
                setBackground(Color.BLUE);
            } else if (index == 2) {
                setBackground(Color.ORANGE);
            } else {
                setBackground(Color.WHITE);
            }

            return this;
        }
    }
}
