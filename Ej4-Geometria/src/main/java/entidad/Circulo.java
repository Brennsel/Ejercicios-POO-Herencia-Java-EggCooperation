package entidad;

import interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(PI * radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * 2 * radio;
    }
}
