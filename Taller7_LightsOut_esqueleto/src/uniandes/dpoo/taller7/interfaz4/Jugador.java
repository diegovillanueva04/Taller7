package uniandes.dpoo.taller7.interfaz4;

public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public int compareTo(Jugador o) {
        return Integer.compare(o.getPuntaje(), this.puntaje);
    }

    @Override
    public String toString() {
        return nombre + " - " + puntaje;
    }
}
