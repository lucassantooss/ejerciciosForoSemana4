package ej4;

public class Cuenta {

private double saldo;
private Cliente titular;

public Cuenta(Cliente titular, double saldo){
    this.titular=titular;
    this.saldo=saldo;
    if(saldo<0){
        this.saldo=0;
    }
}

public void ingresar(double cantidad){
    if(cantidad<=0){
        System.out.println("No se puede ingresar esa cantidad.");
    }else {
        this.saldo += cantidad;
        System.out.println("Ingreso realizado con exito.");
    }
}

public void retirar(double cantidad){
    if(cantidad<=this.saldo){
        this.saldo-=cantidad;
        System.out.println("Retirada realizada con éxito");
    }else{
        System.out.println("No dispones de dinero suficiente para realizar la retirada.");
    }
}
public void mostrarInfo(){
    System.out.println("Saldo actual: "+this.saldo);
}

}
