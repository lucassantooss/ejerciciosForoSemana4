package ej6;

public class Equipo {
    private String nombre;
    private Jugador[] listaJugadores;

    public Equipo(String nombre){
        this.nombre=nombre;
        this.listaJugadores=new Jugador[0];
    }

    public void anhadirJugadores(Jugador jugador){
        Jugador[] nuevoArray=new Jugador[listaJugadores.length+1];
        for(int i=0;i< listaJugadores.length;i++){
            nuevoArray[i]=this.listaJugadores[i];
        }
        nuevoArray[nuevoArray.length-1]=jugador;

        this.listaJugadores=nuevoArray;
    }

    public void mostrarJugadores(){
        System.out.println("Equipo: "+this.nombre);
        for(int i=0;i< listaJugadores.length;i++){
            System.out.println(i+" "+listaJugadores[i].toString());
        }
    }

}
