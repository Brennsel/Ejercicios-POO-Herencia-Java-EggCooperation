package entidad;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {
    private String nombre;
    private long dni;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private int posDeAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, int posDeAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posDeAmarre = posDeAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public int getPosDeAmarre() {
        return posDeAmarre;
    }

    public void setPosDeAmarre(int posDeAmarre) {
        this.posDeAmarre = posDeAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calcularAlquiler(){

        long cantDias;
        double modulo;

        cantDias = DAYS.between(fechaDeAlquiler, fechaDeDevolucion);
        modulo = this.barco.eslora * 10 * cantDias;

        if (barco instanceof Velero){
            modulo += ((Velero) barco).getNroDeMastiles();
        } else if (barco instanceof Yate) {
            modulo += ((Yate) barco).getPotenciaEnCv() + ((Yate) barco).getCantDeCamarotes();
        } else if (barco instanceof BarcoAMotor) {
            modulo += ((BarcoAMotor) barco).getPotenciaEnCv();
        }

        return modulo;
    }
}
