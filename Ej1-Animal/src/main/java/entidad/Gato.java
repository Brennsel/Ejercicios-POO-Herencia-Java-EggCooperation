package entidad;

public class Gato extends Animal {


    public Gato(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " se alimenta de " + alimento);
    }
}
