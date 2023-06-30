package entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora(){

        Scanner leer = new Scanner(System.in);

        super.crearElectrodomestico();

        System.out.print("Carga: ");
        this.carga = leer.nextDouble();

        precioFinal();
    }

    @Override
    public void precioFinal() {

        super.precioFinal();

        if(this.carga>30){
            this.precio += 500;
        }
    }
}
