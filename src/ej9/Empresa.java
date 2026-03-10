package ej9;

public class Empresa {

    private String nombre;
    private Empleado[]listaempleados;

    public Empresa(String nombre){
        this.nombre=nombre;
        this.listaempleados=new Empleado[0];
    }

    public void anhadirEmpleado(Empleado empleado){
        Empleado[] nuevoArray= new Empleado[this.listaempleados.length+1];
        for(int i=0;i< this.listaempleados.length;i++){
            nuevoArray[i]=this.listaempleados[i];
        }
        nuevoArray[nuevoArray.length-1]=empleado;
        this.listaempleados=nuevoArray;
    }

    public double sumarSalarios(){
        double suma=0;
        for(int i=0;i<this.listaempleados.length;i++){
            suma+=this.listaempleados[i].getSalario();
        }
        return suma;
    }

    public void mostrarEmpleados(){
        System.out.println("----- "+this.nombre+" -----");
        for(int i=0;i<this.listaempleados.length;i++){
            System.out.println(i + " Nombre: "+this.listaempleados[i].getNombre()+" Salario: "+this.listaempleados[i].getSalario());
        }
        System.out.println("Suma total de salarios: "+sumarSalarios());
    }

}
