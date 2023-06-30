package entidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {

        char[] letras = {'a', 'b', 'c', 'd', 'e', 'A', 'B', 'C', 'D', 'E'};

        for (char letraActual : letras) {
            if (letra == letraActual) {
                this.consumoEnergetico = letra;
                break;
            }
        }
    }

    private void comprobarColor(String color) {

        List<String> colores = Arrays.asList("negro", "rojo", "azul", "gris");

        for (String colorActual : colores) {
            if (colorActual.equalsIgnoreCase(color)) {
                this.color = colorActual;
            }
        }
    }

    public void crearElectrodomestico() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println(">Ingreso de datos<");

        System.out.print("Color: ");
        comprobarColor(leer.next());

        System.out.print("Consumo Energetico: ");
        comprobarConsumoEnergetico(leer.next().charAt(0));

        System.out.print("Peso: ");
        this.peso = leer.nextDouble();
    }

    public void precioFinal() {

        switch (String.valueOf(this.consumoEnergetico).toUpperCase()) {
            case "A":
                this.precio += 1000;
                break;

            case "B":
                this.precio += 800;
                break;

            case "C":
                this.precio += 600;
                break;

            case "D":
                this.precio += 500;
                break;

            case "E":
                this.precio += 300;
                break;

            case "F":
                this.precio += 100;
                break;

            default:
                this.precio += 100;
                break;
        }

        if (this.peso > 0 && this.peso <= 19) {
            this.precio += 100;
        } else if (this.peso > 19 && this.peso <= 49) {
            this.precio += 500;
        } else if (this.peso > 49 && this.peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
    }

}
