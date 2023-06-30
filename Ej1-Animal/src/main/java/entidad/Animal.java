package entidad;

public abstract class Animal {

    protected String nombre, alimento, raza;
    protected Integer edad;

    public Animal(String nombre, String alimento, String raza, Integer edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public abstract void alimentar();
}