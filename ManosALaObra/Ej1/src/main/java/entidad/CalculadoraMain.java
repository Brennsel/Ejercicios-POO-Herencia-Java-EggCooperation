package entidad;

public class CalculadoraMain {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        c.setNum1(10);
        c.setNum2(5);
        c.setOperador("+");

        System.out.println(c.calcular());

        System.out.println("Suma: " + c.calcular("+"));
        System.out.println("Resta: " + c.calcular("-"));
        System.out.println("Multiplicacion: " + c.calcular("*"));
        System.out.println("Division: " + c.calcular("/"));


        Calculadora c2 = new Calculadora(10, 5);
        c2.setOperador("-");

        System.out.println(c2.calcular());

        System.out.println("Suma: " + c2.calcular("+"));
        System.out.println("Resta: " + c2.calcular("-"));
        System.out.println("Multiplicacion: " + c2.calcular("*"));
        System.out.println("Division: " + c2.calcular("/"));


        Calculadora c3 = new Calculadora(10, 5, "/");

        System.out.println(c3.calcular());
    }
}
