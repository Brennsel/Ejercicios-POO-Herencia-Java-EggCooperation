package entidad;

public class Velero extends Barco {

    private int nroDeMastiles;

    public Velero() {
        super();
        this.nroDeMastiles = (int) (Math.random()*(9 - 1 +1) + 1);
    }

    public int getNroDeMastiles() {
        return nroDeMastiles;
    }

    public void setNroDeMastiles(int nroDeMastiles) {
        this.nroDeMastiles = nroDeMastiles;
    }
}
