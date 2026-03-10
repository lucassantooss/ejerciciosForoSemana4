package ej5;

public class Biblioteca {
    private Libro [] listaLibros;
    private int contador;
    private String nombre;

    public Biblioteca(String nombre){
        this.listaLibros=new Libro[0];
        this.nombre=nombre;
        this.contador=0;
    }

    public void anhadirLibros(Libro libro){
        //Nuevo array con una posicion mas
        Libro[] nuevoArray=new Libro[listaLibros.length+1];
        //Copiamos el array viejo al nuevo
        for(int i=0;i< listaLibros.length;i++){
            nuevoArray[i]=this.listaLibros[i];
        }
        //Añadimos el nuevo libro en la ultima posicion del nuevo array
        nuevoArray[nuevoArray.length-1]=libro;

        //Sustituir array viejo por el nuevo
        this.listaLibros=nuevoArray;
        this.contador++;
    }

    public void mostrarLibros(){
        System.out.println("Nombre: "+this.nombre);
        for(int i=0;i< listaLibros.length;i++){
            System.out.println(i+" "+listaLibros[i].toString());
        }
        System.out.println("Numero de libros en la biblioteca: "+this.contador);
    }
}
