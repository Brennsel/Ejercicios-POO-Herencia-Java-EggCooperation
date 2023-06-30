/*
. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor
 */

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;

import java.util.ArrayList;
import java.util.List;

public class MainElectrodomestico {
    public static void main(String[] args) {

        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        double pLavadora = 0.0 , pTelevisor = 0.0;

        Lavadora lavadora1 = new Lavadora(1000, "Blanco", 'B', 60, 40);
        Lavadora lavadora2 = new Lavadora(1000, "Azul", 'A', 40, 60);
        Televisor televisor1 = new Televisor(1000, "Blanco", 'D', 30, 50, false);
        Televisor televisor2 = new Televisor(1000, "Negro", 'F', 100, 10, true);

        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);

        for(Electrodomestico actual: electrodomesticos){
            actual.precioFinal();
            System.out.println(actual.getClass().toString() + ": $" + actual.getPrecio());

            if(actual instanceof Lavadora){
                pLavadora += actual.getPrecio();
            }else{
                pTelevisor += actual.getPrecio();
            }
        }

        System.out.println(">El precio final de las lavadoras es: $ " + pLavadora);
        System.out.println(">>El precio final de los televisores es: $ " + pTelevisor);
        System.out.println(">>>El precio total de los electrodomesticos es: $" + (pLavadora+pTelevisor));

    }
}
