package ej2;

public class Curso {
    private String nombre;
    private Alumnos[] alumnos;

    public Curso(String nombre, Alumnos[] alumnos){
        this.nombre=nombre;
        this.alumnos=alumnos;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarDatos(){
        System.out.println("Curso: "+nombre);
        System.out.println("Alumnos");
        for(int i=0;i< alumnos.length;i++){
            System.out.println(alumnos[i]);
        }
    }




}
