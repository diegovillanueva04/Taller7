package uniandes.dpoo.taller7.interfaz3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelTablero extends JPanel {
    private int numFilas;
    private int numColumnas;

    public PanelTablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        int anchoCelda = getWidth() / numColumnas;
        int altoCelda = getHeight() / numFilas;


        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                int xCelda = columna * anchoCelda;
                int yCelda = fila * altoCelda;
                g.setColor(Color.YELLOW);
                g.fillRect(xCelda, yCelda, anchoCelda, altoCelda);
                g.setColor(Color.BLACK);
                g.drawRect(xCelda, yCelda, anchoCelda, altoCelda);
            }
        }
    }

    public void setDimensiones(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        repaint(); 
    }
}
