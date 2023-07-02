package entidad;

public class BarcoAMotor extends Barco{

    protected double potenciaEnCv;

    public BarcoAMotor() {
        super();
        this.potenciaEnCv = Math.floor(Math.random()*(200 - 40 +1) + 40);
    }

    public double getPotenciaEnCv() {
        return potenciaEnCv;
    }

    public void setPotenciaEnCv(double potenciaEnCv) {
        this.potenciaEnCv = potenciaEnCv;
    }
}
