package ej8;

import ej7.Producto;

public class Hotel {

    private String nombre;
    private Habitacion[] listaHabitaciones;

    public Hotel(String nombre){
        this.nombre=nombre;
        this.listaHabitaciones=new Habitacion[0];

    }

    public void anhadirHabitacion(Habitacion habitacion){

        Habitacion[] nuevoArray=new Habitacion[listaHabitaciones.length+1];
        for(int i=0;i< listaHabitaciones.length;i++){
            nuevoArray[i]=listaHabitaciones[i];
        }
        nuevoArray[nuevoArray.length-1]=habitacion;
        this.listaHabitaciones=nuevoArray;
    }

    public double sumarPrecios(){
        double total=0;
        for(int i=0;i< listaHabitaciones.length;i++){
            total+=listaHabitaciones[i].getPrecio();
        }
        return total;

    }

    public void mostrarHabitaciones(){
        System.out.println("-----HOTEL "+nombre+" -----");
        for(int i=0;i< listaHabitaciones.length;i++){
            System.out.println("Habitacion: "+listaHabitaciones[i].getNumeroHabitacion()+" precio: "+listaHabitaciones[i].getPrecio());
        }
        System.out.println("Precio total: "+sumarPrecios());
    }

}
