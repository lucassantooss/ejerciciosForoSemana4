package ej6;

public class Jugador {

    private String nombre;
    private String posicion;

    public Jugador(String nombre, String posicion){
        this.nombre=nombre;
        this.posicion=posicion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Posicion: " + posicion;
    }

}
