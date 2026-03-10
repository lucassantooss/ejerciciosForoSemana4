package ej9;

public class Main {
    public static void main(String[] args) {

        Empleado a=new Empleado("Lucas", 2400);
        Empleado b=new Empleado("Maria", 2800);
        Empleado c=new Empleado("Martina", 1400);

        Empresa x=new Empresa("Inditex");
        x.anhadirEmpleado(a);
        x.anhadirEmpleado(b);
        x.anhadirEmpleado(c);

        x.mostrarEmpleados();

    }
}
