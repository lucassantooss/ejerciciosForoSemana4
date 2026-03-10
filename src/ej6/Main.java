package ej6;

public class Main {
    public static void main(String[] args) {

        Jugador uno=new Jugador("Lamine Yamal", "Extremo derecho");
        Jugador dos=new Jugador("Cubarsi", "Defensa Central");
        Jugador tres=new Jugador("Pedri", "Centrocampista");

        Equipo Barcelona=new Equipo("Barcelona");

        Barcelona.anhadirJugadores(uno);
        Barcelona.anhadirJugadores(dos);
        Barcelona.anhadirJugadores(tres);

        Barcelona.mostrarJugadores();

    }
}
