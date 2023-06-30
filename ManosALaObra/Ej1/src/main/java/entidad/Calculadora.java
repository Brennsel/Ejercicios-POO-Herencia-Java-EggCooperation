package entidad;

public class Calculadora {

    Integer num1;
    Integer num2;
    String operador;
    Integer resultado;

    // SOBRECARGA DE CONSTRUCTOR -> MISMO NOMBRE DE CLASE, DIFERENTE CANTIDAD DE PARAMETROS
    public Calculadora(){
    }

    public Calculadora(Integer num1, Integer num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculadora(Integer num1, Integer num2, String operador){
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }

    //SOBRECARGA DE METODOS -> MISMO NOMBRE DE METODO, DIFERENTE CANTIDAD DE PARAMETROS
    public Integer calcular (){
        switch (this.operador){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }

    public Integer calcular (String operador){
        switch (operador){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }

    public void setNum1 (Integer num1){
        this.num1 = num1;
    }

    public void setNum2 (Integer num2){
        this.num2 = num2;
    }

    public void setOperador (String operador){
        this.operador = operador;
    }
}
