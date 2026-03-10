package ej4;

public class Main {
    public static void main(String[] args) {

    Cliente uno=new Cliente("Lucas", 12345678);
    Cuenta nueva=new Cuenta(uno,120);

    uno.mostrarCliente();
    nueva.mostrarInfo();
    nueva.ingresar(20);
    nueva.retirar(120);
    nueva.mostrarInfo();



    }
}