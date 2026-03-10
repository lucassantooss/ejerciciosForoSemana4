package ej7;

public class Main {
    public static void main(String[] args) {

        Producto uno=new Producto("Pan", 1.20);
        Producto dos=new Producto("Leche", 1.06);
        Producto tres=new Producto("Galletas", 2.20);

        Pedido x=new Pedido(1);

        x.agregarProducto(uno);
        x.agregarProducto(dos);
        x.agregarProducto(tres);

        x.mostrarProductos();

        Producto cuatro=new Producto("Agua",0.25);

        x.agregarProducto(cuatro);

        x.mostrarProductos();

    }
}
