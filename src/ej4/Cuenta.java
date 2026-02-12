package ej4;

public class Cuenta {

private double saldo;

public Cuenta(double saldo){
    this.saldo=saldo;
    if(saldo<0){
        saldo=0;
    }
}

public void ingresar(int cantidad){
    saldo+=cantidad;
    System.out.println("Ingreso realizado con exito.");
}

public void retirar(int cantidad){
    saldo-=cantidad;
    System.out.println("Retirada realizada con exito.");
}
public void mosrtarInfo(){
    System.out.println("Saldo actual: "+saldo);
}

}
