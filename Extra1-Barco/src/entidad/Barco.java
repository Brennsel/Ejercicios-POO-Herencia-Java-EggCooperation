package entidad;

import java.time.LocalDate;

public class Barco {

    protected int matricula;
    protected double eslora;
    protected int anioDeFabricacion;

    public Barco() {
        this.matricula = (int) (Math.random()*(9999 - 1000 +1) + 1000);
        this.eslora = Math.floor(Math.random()*(100 - 10 +1) + 10);
        this.anioDeFabricacion = (int) (Math.random()*(LocalDate.now().getYear() - 2000 +1) + 2000);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }
}
