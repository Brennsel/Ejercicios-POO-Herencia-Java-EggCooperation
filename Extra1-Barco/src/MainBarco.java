/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */

import entidad.*;

import java.time.LocalDate;
import java.util.Scanner;

public class MainBarco {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Alquiler alquiler = crearAlquiler();

        System.out.println("El monto a pagar es: $" + alquiler.calcularAlquiler());

        mostrarBarco(alquiler);
    }

    public static void mostrarBarco(Alquiler alquiler){

        Barco barco = alquiler.getBarco();

        System.out.println("======================================");
        System.out.println("Eslora: " + barco.getEslora());
        System.out.println("Matricula: " + barco.getMatricula());
        System.out.println("Año: " + barco.getAnioDeFabricacion());

        if (barco instanceof Velero){
            System.out.println("Cantidad de mastiles: " + ((Velero) barco).getNroDeMastiles());
        } else if (barco instanceof Yate) {
            System.out.println("Potencia CV: " + ((Yate) barco).getPotenciaEnCv());
            System.out.println("Cantidad de camarotes: " + ((Yate) barco).getCantDeCamarotes());
        } else if (barco instanceof BarcoAMotor) {
            System.out.println("Potencia CV: " + ((BarcoAMotor) barco).getPotenciaEnCv());
        }
        System.out.println("======================================");
    }

    public static Alquiler crearAlquiler() {

        Barco barco;

        String nombre;
        long dni;
        LocalDate fechaIni, fechaFin;
        int pos, opcion;

        System.out.println(">>>>>>>CREAR~ALQUILER<<<<<<<<<");
        System.out.println(">Ingreso de datos<");
        System.out.print("Nombre: ");
        nombre = leer.next();

        System.out.print("DNI: ");
        dni = leer.nextLong();

        System.out.println(">Fecha de alquiler ");
        fechaIni = setearFecha();

        System.out.println(">Fecha de devolucion");
        fechaFin = setearFecha();

        System.out.print("Posicion de amarre: ");
        pos = leer.nextInt();

        System.out.println("Seleccione barco a alquilar: ");
        System.out.println("1. Normal ");
        System.out.println("2. Velero ");
        System.out.println("3. Barco a Motor");
        System.out.println("4. Yate");
        System.out.print(">> ");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                barco = new Barco();
                break;

            case 2:
                barco = new Velero();
                break;

            case 3:
                barco = new BarcoAMotor();
                break;

            case 4:
                barco = new Yate();
                break;

            default:
                barco = null;
                System.out.println("Incorrecto.");
                break;
        }

        return new Alquiler(nombre, dni, fechaIni, fechaFin, pos, barco);
    }

    private static LocalDate setearFecha() {
        int d, m, a;

        System.out.print("Dia: ");
        d = leer.nextInt();
        System.out.print("Mes: ");
        m = leer.nextInt();
        System.out.print("Año: ");
        a = leer.nextInt();

        return LocalDate.of(a, m, d);
    }
}