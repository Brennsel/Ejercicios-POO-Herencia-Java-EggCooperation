/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:

 */

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

public class AnimalMain {
    public static void main(String[] args) {

        Animal perro1 = new Perro("Nina", "Croquetas", "Salchicha", 9);
        Animal perro2 = new Perro("Luna", "Vitalcan", "Mestiza", 7);
        Animal gato1 = new Gato("Manchita", "Galletas", "Siames", 3);
        Animal caballo1 = new Caballo("Spark", "Pasto", "Fino", 12);

        perro1.alimentar();
        perro2.alimentar();
        gato1.alimentar();
        caballo1.alimentar();
    }
}
