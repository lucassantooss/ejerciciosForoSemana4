package ej1;

public class ObjetoInventario {

    private String objeto;
    private int cantidad;

    public ObjetoInventario(String objeto, int cantidad){
        this.objeto=objeto;
        this.cantidad=cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getObjeto() {
        return objeto;
    }

    public String mostrarObjeto(){
        return objeto+ ": "+cantidad;
    }

    @Override
    public String toString(){
        return this.objeto;
    }
}