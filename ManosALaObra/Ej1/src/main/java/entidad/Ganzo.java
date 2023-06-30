package entidad;

public class Ganzo extends Ave implements Nadador, Volador{

    @Override
    public void nadar() {
        System.out.println("Estoy nadando como un ganzo");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando como un ganzo");
    }
}
