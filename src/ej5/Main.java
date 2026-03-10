package ej5;

public class Main {
    public static void main(String[] args) {

        Libro uno=new Libro("Ludopatia", "Marcos");
        Libro dos=new Libro("Panchilandia", "Pesado");
        Libro tres=new Libro("Trabucazo", "Trabuco");

        Biblioteca b1=new Biblioteca("Empresas");
        b1.anhadirLibros(uno);
        b1.anhadirLibros(dos);
        b1.anhadirLibros(tres);

        b1.mostrarLibros();
    }
}
