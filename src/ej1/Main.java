package ej1;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        //Se quiere modelar un videojuego sencillo. Cada jugador tiene un nombre y una cantidad de vida. Además, cada jugador tiene un inventario donde se guardan los objetos que posee. Diseña las clases necesarias y programa un ejemplo donde se cree un jugador, se le añadan varios objetos al inventario y se muestre su estado. El programa principal no debe acceder directamente a los datos del inventario.
        //Clase ej1.Jugador: nombre(String), vida(int), getNombre(String), getVida(int), mostrarJugador(void)
        //Clase Inventario: arrayObjetos(String),anadirObjeto(String), mostrarInventario(void),

        //Creamos los items del array inventario
        ObjetoInventario[] inventario=new ObjetoInventario[3];
        inventario[0]=new ObjetoInventario("Espada", 1);
        inventario[1]=new ObjetoInventario("Pociones", 2);
        inventario[2]=new ObjetoInventario("Escudo", 1);

        //Creamos el jugador con sus variables
        Jugador uno = new Jugador("Jose", 80, inventario);

        uno.mostrarJugador();
        uno.mostrarObjetos();


    }
}
