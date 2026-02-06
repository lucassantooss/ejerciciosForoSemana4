package ej2;

import ej1.Jugador;

public class Main {
    //Ejercicio 2
    //Un curso tiene un nombre y un conjunto de alumnos. Cada alumno tiene un nombre y una nota media. Diseña las clases necesarias para representar esta situación. Implementa un programa que cree un curso con varios alumnos y muestre el nombre del curso junto con la información de todos sus alumnos.

    Alumnos[] alumnos=new Alumnos[5];
    Curso dam = new Curso("1º DAM - Programación", alumnos);

    Alumnos a1 = new Alumnos("Ana", 18,7.8);
    Alumnos a2 = new Alumnos("Luis", 23, 5.7);

    Alumnos[] listaAlumnos = {a1, a2, new Alumnos("Marta", 19, 8.9)};
    
}
