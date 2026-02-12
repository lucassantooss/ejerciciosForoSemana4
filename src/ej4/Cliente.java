package ej4;

public class Cliente {

    private String nombre;
    private int DNI;

    public Cliente(String nombre,int DNI){
        this.nombre=nombre;
        this.DNI=DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarCliente(){
        System.out.println("Titular: "+nombre);
        System.out.println("DNI: "+DNI);
    }
}
