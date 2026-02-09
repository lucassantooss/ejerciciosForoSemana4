package ej2;

public class Curso {
    private String nombreCurso;
    private Alumno[] alumnos;

    public Curso(String nombreCurso, Alumno[] alumnos){
        this.nombreCurso=nombreCurso;
        this.alumnos=alumnos;
    }

    public void mostrarDatos(){
        System.out.println("Curso: "+nombreCurso);
        System.out.println("Alumnos: ");
        for(int i=0;i< alumnos.length;i++){
            System.out.println("Alumno: "+alumnos[i]);
        }
    }




}
