package entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico{

    private double pulgadas;
    private boolean sintonizador;

    public Televisor(){
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, double pulgadas, boolean sintonizador) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor(){

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String aux;
        boolean ingresoCorrecto = false;

        super.crearElectrodomestico();

        System.out.print("Pulgadas: ");
        this.pulgadas = leer.nextDouble();

        do{
            System.out.print("¿Tiene sintonizador TDT? (s/n): ");
            aux = leer.next();

            if(aux.equalsIgnoreCase("s")){
                this.sintonizador = true;
                ingresoCorrecto = true;

            } else if(aux.equalsIgnoreCase("n")){
                this.sintonizador = false;
                ingresoCorrecto = true;
            }

            if(!ingresoCorrecto){
                System.out.println("Ingreso incorrecto. Ingrese nuevamente");
            }

        } while(!ingresoCorrecto);

        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

       if(this.pulgadas>40){
          this.precio += this.precio * 0.3;
       }

        if(this.sintonizador){
            this.precio += 500;
        }
    }
}

