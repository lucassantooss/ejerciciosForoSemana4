package ej7;

import ej6.Jugador;

public class Pedido {

        private int contador;
        private Producto [] listaProductos;
        private int numero;

        public Pedido(int numero){
            this.listaProductos= new Producto[0];
            this.numero=numero;
            this.contador=0;
        }

        public void agregarProducto(Producto producto){
            Producto[] nuevoArray=new Producto[listaProductos.length+1];
            for(int i=0;i< this.listaProductos.length;i++){
                nuevoArray[i]=this.listaProductos[i];
            }
            nuevoArray[nuevoArray.length-1]=producto;

            this.listaProductos=nuevoArray;
        }

        public double sumarPrecios(){
            double suma=0;
            for(int i=0;i<this.listaProductos.length;i++){
                suma+=this.listaProductos[i].getPrecio();
            }
            return suma;
        }

        public void mostrarProductos(){
            System.out.println("PRODUCTOS");
            for(int i=0;i< this.listaProductos.length;i++){
                System.out.println("Producto: "+i+" "+this.listaProductos[i].toString());
            }
            System.out.println("Precio total: "+sumarPrecios());
    }

}
