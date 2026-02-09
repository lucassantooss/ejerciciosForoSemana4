package ej3;

public class Motor {
    private int potencia;
    private boolean encendido;

    public Motor(int potencia){
        this.potencia=potencia;
        this.encendido=false;
    }

    public void encender(){
        encendido=true;
        System.out.println("Motor encendido.");
    }

    public void apagar(){
        encendido=false;
        System.out.println("Motor apagado.");
    }

    public int getPotencia(){
        return potencia;
    }

    public boolean isEncendido(){
        return encendido;
    }




}
