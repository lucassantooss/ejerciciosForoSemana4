package ej2;

public class Alumno {
    private String nombre;
    private double notaMedia;

    public Alumno(String nombre, double notaMedia){
        this.nombre=nombre;
        this.notaMedia=notaMedia;
    }
    //Asi me imprime los datos
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Nota Media: " + notaMedia;
    }


}
