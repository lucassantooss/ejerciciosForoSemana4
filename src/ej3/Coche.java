package ej3;

public class Coche {
    private String nombreMarca;
    private Motor motor;

    public Coche(String nombreMarca,int potencia){
        this.nombreMarca=nombreMarca;
        this.motor=new Motor(potencia);
    }

    public void encenderCoche(){
        System.out.println("Coche "+nombreMarca+" intentando arrancar...");
        motor.encender();
    }

    public void apagarCoche(){
        System.out.println("Coche "+nombreMarca+" apagandose...");
        motor.apagar();
    }

    public void mostrarEstado(){
        if (motor.isEncendido()) {
            System.out.println("El "+nombreMarca+" esta encendido");
        }else{
            System.out.println("El "+nombreMarca+" esta apagado");
        }
    }
}