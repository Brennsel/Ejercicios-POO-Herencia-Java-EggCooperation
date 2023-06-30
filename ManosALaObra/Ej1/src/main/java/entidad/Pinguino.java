package entidad;

public class Pinguino extends Ave implements Nadador{

    @Override
    public void nadar() {
        System.out.println("Toy nadando");
    }
}
