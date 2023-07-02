package entidad;

public class Yate extends BarcoAMotor{
    private int cantDeCamarotes;

    public Yate() {
        super();
        this.cantDeCamarotes = (int) (Math.random()*(50 - 3 +1) + 3);
    }
    public double getPotenciaEnCv() {
        return potenciaEnCv;
    }

    public void setPotenciaEnCv(double potenciaEnCv) {
        this.potenciaEnCv = potenciaEnCv;
    }

    public int getCantDeCamarotes() {
        return cantDeCamarotes;
    }

    public void setCantDeCamarotes(int cantDeCamarotes) {
        this.cantDeCamarotes = cantDeCamarotes;
    }
}
