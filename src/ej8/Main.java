package ej8;

public class Main {
    public static void main(String[] args) {

        Habitacion uno=new Habitacion(123,265.8);
        Habitacion dos=new Habitacion(303, 670.7);
        Habitacion tres=new Habitacion(12,56.9);

        Hotel a=new Hotel("Atica 21");

        a.anhadirHabitacion(uno);
        a.anhadirHabitacion(dos);
        a.anhadirHabitacion(tres);

        a.mostrarHabitaciones();

    }
}
