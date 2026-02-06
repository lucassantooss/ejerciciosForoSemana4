package ej1;

public class Jugador {

    private String nombre;
    private int vida;
    private ObjetoInventario[] inventario;

    public Jugador(String nombre, int vida, ObjetoInventario[] inventario){
        this.nombre=nombre;
        this.vida=vida;
        this.inventario=inventario;
    }

    public void mostrarJugador(){
        System.out.println("Estado del jugador");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Vida: "+this.vida);
        System.out.println("Numero de objetos en el inventario: "+inventario.length);
    }

    public void mostrarObjetos(){
        for(int i=0;i< inventario.length;i++){
            System.out.println(inventario[i].mostrarObjeto());
        }
    }

}

