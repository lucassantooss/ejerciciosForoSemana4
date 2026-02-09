package ej2;

import ej1.Jugador;
//Ejercicio 2
//Un curso tiene un nombre y un conjunto de alumnos. Cada alumno tiene un nombre y una nota media. Diseña las clases necesarias para representar esta situación. Implementa un programa que cree un curso con varios alumnos y muestre el nombre del curso junto con la información de todos sus alumnos.

public class Main {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("Ana", 7.8);
        Alumno a2 = new Alumno("Luis", 5.7);
        Alumno a3 = new Alumno("Marcos",4.5);

        Alumno[] alumnos = new Alumno[]{a1, a2,a3};
        Curso DAM = new Curso("1º DAM", alumnos);

        DAM.mostrarDatos();
    }
}
